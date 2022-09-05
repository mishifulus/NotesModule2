package com.example.ejemplo1;

import org.springframework.beans.factory.annotation.Autowired;

public class Taxi {
    private Motor motor;
    private Llantas llantas;

    //Setter
    @Autowired
    public void setMotor(Motor motor)
    {
        this.motor = motor;
    }

    @Autowired
    public void setLlantas(Llantas llantas)
    {
        this.llantas = llantas;
    }
}
