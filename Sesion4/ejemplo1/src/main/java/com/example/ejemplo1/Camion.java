package com.example.ejemplo1;

import org.springframework.beans.factory.annotation.Autowired;

public class Camion {
    @Autowired
    Motor motor;

    @Autowired
    Llantas llantas;
}
