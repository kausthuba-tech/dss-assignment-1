package com.example.assignment_model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class Dss1AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dss1AssignmentApplication.class, args);
	}

}
