package com.example.ejemplo1;

import org.springframework.beans.factory.annotation.Autowired;

//Constructor
public class Moto {
    Motor motor;
    Llantas llantas;

    @Autowired
    Moto(Llantas llantas)
    {
        this.llantas = llantas;
    }
}
