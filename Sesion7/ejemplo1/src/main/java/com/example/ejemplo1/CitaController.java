package com.example.ejemplo1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(produces = {"application/json"}) //Especificamos que trabajaremos con JSON
public class CitaController {

    @GetMapping("/hola")
    public Cita hola()
    {
        Cita cita = new Cita();
        cita.setAutor("Feynman");
        cita.setTexto("Hola");
        return cita;
    }

    @GetMapping("/adios")
    public Cita adios()
    {
        Cita cita = new Cita();
        cita.setAutor("Feynman");
        cita.setTexto("Hola");
        return cita;
    }

    @GetMapping ("/saluda/{nombre}") //Path con parametros variables "nombre"
    public Cita saluda(@PathVariable("nombre") String nombre)
    {
        Cita cita = new Cita();
        cita.setAutor(nombre);
        cita.setTexto("Hola " + nombre); //Convertimos a String
        return cita;
    }

    @GetMapping ("/despide/{nombre}") //Path con parametros variables "nombre"
    public Cita despide(@PathVariable("nombre") String nombre)
    {
        Cita cita = new Cita();
        cita.setAutor(nombre);
        cita.setTexto("Hola " + nombre);
        return cita;
    }

    @PostMapping(path = "/hola", consumes = "application/json", produces = "application/json")
    public Cita hola2(@RequestBody Peticion peticion)
    {
        Cita cita = new Cita();
        cita.setAutor("Feynman");
        cita.setTexto(peticion.getCadena());
        log.info("" + peticion.getBandera());
        return cita;
    }

    @PostMapping(path = "/adios", consumes = "application/json", produces = "application/json")
    public Peticion adios2(@RequestBody Cita cita)
    {
        Peticion peticion = new Peticion();
        peticion.setCadena("Adiooooos " + cita.getAutor());
        peticion.setCadena("true");
        return peticion;
    }

    @DeleteMapping("/cita/{autor}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT) //Par motrar un anuncio de estatus
    public String borrarCita(@PathVariable String autor)
    {
        log.info("Request delete recibida, borrando algo de " + autor);
        return "Cita eliminada";
    }

    @DeleteMapping("/citas/{id}")
    public String borrarCitaById(@PathVariable Integer id)
    {
        log.info("Request delete recibida, borrando la cita con id " + id);
        return "Cita eliminada";
    }
}
