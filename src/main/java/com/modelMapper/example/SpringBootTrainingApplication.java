package com.modelMapper.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringBootTrainingApplication {

	public static void main(String[] args) {
		System.out.println(new Date());
		SpringApplication.run(SpringBootTrainingApplication.class, args);
	}

}
