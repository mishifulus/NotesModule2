package org.bedu.ejemplo1.data;

import org.bedu.ejemplo1.Ticket;
import org.bedu.ejemplo1.Transaccion;

import java.util.List;

public interface Repositorio {
    void guardarTransaccion(Transaccion transaccion);

    List<Transaccion> obtenerTransacciones();

    void guardarNumeroTrades(Ticket ticket);

    List<Ticket> obtenerNumeroTrades();
}
