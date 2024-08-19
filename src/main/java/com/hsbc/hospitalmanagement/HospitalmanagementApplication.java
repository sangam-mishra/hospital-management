package com.hsbc.hospitalmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HospitalmanagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(HospitalmanagementApplication.class, args);

	}
	//it is working as a rest client
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
