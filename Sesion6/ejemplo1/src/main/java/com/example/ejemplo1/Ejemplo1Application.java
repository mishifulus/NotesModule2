package com.example.ejemplo1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

@SpringBootApplication
@Slf4j
public class Ejemplo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo1Application.class, args);
	}

	/*@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception
	{
		return args -> {
			AvailableBooks availableBooks =
					restTemplate.getForObject("https://api.bitso.com/v3/available_books/", AvailableBooks.class);
			log.info(availableBooks.toString());
		};
	}*/

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception
	{
		//Se crea un array de la clase para obtener todos los elementos
		return args -> {
			Texto[]  texto =
					restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", Texto[].class);
			//Se recorre cada elemento y se imprime en log
			for(Texto elemento: texto)
			{
				log.info("{}",elemento);
			}
		};
	}


}
