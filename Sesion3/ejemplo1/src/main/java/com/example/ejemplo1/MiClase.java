package com.example.ejemplo1;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

@Slf4j
public class MiClase implements  MiInterface{

    @Override
    public String miMetodo() {
        return "Mi clase";
    }

    @PostConstruct //Es ejecutado automaticamente sin necesidad de instanciar el metodo
    public void mensaje()
    {
        log.info("Construido");
    }
}
