package com.example.ejemplo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Ejemplo3Application {

	@Value("Java")
	private String language;

	@Value("${miclavesupersecreta}")
	private String pass;

	@PostConstruct
	private void print()
	{
		//System.out.println("Hola "+ language);
		System.out.println("Hola "+ pass);
	}

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo3Application.class, args);
	}

}
