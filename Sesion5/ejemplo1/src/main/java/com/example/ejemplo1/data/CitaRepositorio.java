package com.example.ejemplo1.data;

public interface CitaRepositorio {
    Iterable<Cita> encuentraTodos();
    Cita guardar(Cita cita);
    Cita encontrarPorNombre(String nombre);
}
