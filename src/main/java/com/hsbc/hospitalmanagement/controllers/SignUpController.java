package com.hsbc.hospitalmanagement.controllers;

import com.hsbc.hospitalmanagement.dtos.EmployeeRequest;
import com.hsbc.hospitalmanagement.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SignUpController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/signup")
    public String loadSignUp(Model model) throws NoSuchFieldException, IllegalAccessException {
        List<String> countryNames=countryService.getCountryNames();
        model.addAttribute("countryNames",  countryService.getCountryNames());
        model.addAttribute("employeeRequest" , new EmployeeRequest());
        return "signup.html";
    }
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employeeRequest") EmployeeRequest employeeRequest,Model model){
        if(employeeRequest.getFirstName().length()>0) {
            return "signin.html";
        }
            else {
            return "redirect://signup";

        }
    }
}
