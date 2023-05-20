package com.example.Internship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.Internshipcontroller")
@EnableJpaRepositories(basePackages = "com.example.Internshiprepositary")
@EntityScan(basePackages = "com.example.internshipstudents")
public class InternshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternshipApplication.class, args);
	}

}
