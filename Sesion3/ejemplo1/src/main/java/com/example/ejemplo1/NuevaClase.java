package com.example.ejemplo1;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

@Slf4j
public class NuevaClase implements MiInterface{

    @Override
    public String miMetodo() {
        return "Mi nueva clase";
    }

    @PostConstruct
    public void mensaje()
    {
        log.info("Contruida nueva clase");
    }
}
