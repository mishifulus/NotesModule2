package com.example.ejemplo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // activamos las tareas programadas con esta anotación
public class Ejemplo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo2Application.class, args);
	}

}
