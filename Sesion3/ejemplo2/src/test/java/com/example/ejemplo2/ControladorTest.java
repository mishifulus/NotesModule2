package com.example.ejemplo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControladorTest {

    @Test
    public void testControlador()
    {
        Controlador controlador = new Controlador();
        String result = controlador.hola();
        String expected = "Hola :D";
        assertEquals(expected,result);
    }

    @Test
    public void testSaluda()
    {
        Controlador controlador = new Controlador();
        String result = controlador.saludar("Citlalli");
        String expected = "Hola Citlalli";
        assertEquals(expected,result);
    }

    @Test
    public void testDespide()
    {
        Controlador controlador = new Controlador();
        String result = controlador.despedir("Citlalli");
        String expected = "Adios Citlalli";
        assertEquals(expected,result);
    }

}