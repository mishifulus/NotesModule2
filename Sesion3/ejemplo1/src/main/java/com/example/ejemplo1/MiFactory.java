package com.example.ejemplo1;

public class MiFactory {

    public MiClase getClase()
    {
        return new MiClase();
    }

    public  NuevaClase getNuevaClase()
    {
        return new NuevaClase();
    }
}
