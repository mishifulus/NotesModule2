package org.bedu.proyectoPersonal.sesion6;

import lombok.Data;

import java.util.List;

@Data
public class AvailableBooks {
    Boolean successs;
    List<Book> payload;
}
