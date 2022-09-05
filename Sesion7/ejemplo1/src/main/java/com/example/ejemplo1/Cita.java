package com.example.ejemplo1;

import lombok.Data;

@Data
public class Cita {
    String autor;
    String texto;
}

/*new Cita ("Javier", "Hola")
= JSON
        {
                "autor" : "javier",
                "texto" : "Hola"
        }*/
