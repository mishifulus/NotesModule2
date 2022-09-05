package com.example.ejemplo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejemplo1Application {

	//Creamos una clase par crear un interface
	@Bean //Se parece a componente, estandar de la definicion de la clase
			//Todos los atributos son privados, getters and setters
			//Constructores, uno vacio y otro lleno
			//Es una clase con las caracteristicas para realizar un CRUD
			//Genera el objeto de un metodo y lo agrega a la aplicacion

	static public MiInterface miBean()
	{
		//return new MiFactory().getClase();
		return new MiFactory().getNuevaClase();
	}

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo1Application.class, args);
		//Pedimos una clase, de ahi creamos una interface con el mibean
		//new NecesitoUnaClase(mibean());

	}

}
