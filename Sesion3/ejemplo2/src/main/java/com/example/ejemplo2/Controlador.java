package com.example.ejemplo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Define una clase como controlador para usar una API REST
@RequestMapping("/") //Agregar un path para acceder al controlador
public class Controlador {

    @GetMapping("/") //Modifica el path para usar el servicio
    public String hola()
    {
        return "Hola :D";
    }

    @GetMapping("/saluda/{nombre}") //Variable path
    public String saludar(@PathVariable (value = "nombre") String name) //Se recoge el parametro introducido en la url
    {
        return "Hola " + name;
    }

    @GetMapping("/despide/{nombre}") //Variable path
    public String despedir(@PathVariable (value = "nombre") String name) //Se recoge el parametro introducido en la url
    {
        return "Adios " + name;
    }

}
