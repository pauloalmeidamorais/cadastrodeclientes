package com.cadastrodeclientes.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan (basePackages = {
		"com.cadastrodeclientes.app.repository",
		"com.cadastrodeclientes.app.service",
		"com.cadastrodeclientes.app.configuration"
})
@RestController
public class VendaApplication {

	@Autowired
	@Qualifier ("applicationName")
	private String applicationName;

	@GetMapping("/home")
	public String homeMap(){
		return applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(VendaApplication.class, args);
	}
}
