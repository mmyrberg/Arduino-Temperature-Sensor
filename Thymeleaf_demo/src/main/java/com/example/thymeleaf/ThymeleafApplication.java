package com.example.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.FileNotFoundException;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ThymeleafApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(ThymeleafApplication.class, args);

	}


}


