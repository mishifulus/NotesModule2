package com.example.ejemplo1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Ejemplo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo1Application.class, args);
		log.info("This is my message with INFO level");
		log.debug("This is my message with DEBUG level");
		log.error("This is my message with ERROR level");
	}

}
