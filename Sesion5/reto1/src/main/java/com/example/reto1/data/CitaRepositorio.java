package com.example.reto1.data;

public interface CitaRepositorio {
    Iterable<Cita> encuentraTodos();
    Cita guardar(Cita cita);
    //Cita encontrarPorNombre();
}
