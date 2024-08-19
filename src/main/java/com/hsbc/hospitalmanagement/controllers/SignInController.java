package com.hsbc.hospitalmanagement.controllers;

import com.hsbc.hospitalmanagement.dtos.EmployeeRequest;
import com.hsbc.hospitalmanagement.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SignInController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/signin")
    public String loadSignIn(Model model) throws NoSuchFieldException, IllegalAccessException {
        List<String> countryNames=countryService.getCountryNames();
        model.addAttribute("countryNames",  countryService.getCountryNames());

        return "signin";
    }
}
