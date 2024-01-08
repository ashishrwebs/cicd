package com.cicd.CICD.DEMO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdDemoApplication.class, args);
	}

	@GetMapping("/hi")
	public String send() {
		return "hi";
	}

}
