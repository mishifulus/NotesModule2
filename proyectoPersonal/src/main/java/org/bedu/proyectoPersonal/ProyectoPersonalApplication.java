package org.bedu.proyectoPersonal;

import lombok.extern.slf4j.Slf4j;
import org.bedu.proyectoPersonal.sesion3.MiInterfaz;
import org.bedu.proyectoPersonal.sesion3.PizzaFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class ProyectoPersonalApplication {

	@Bean
	static public MiInterfaz miBean()
	{
		return new PizzaFactory().hacerPizza();
	}

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPersonalApplication.class, args);
		log.info("Bienvenido a la aplicacion personal de Citlalli");
	}

}
