package com.dh.lesson_21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lesson21Application {

	public static void main(String[] args) {
		SpringApplication.run(Lesson21Application.class, args);	}

	@GetMapping
	public String test(){
		return "Olá mundo!";
	}




}
