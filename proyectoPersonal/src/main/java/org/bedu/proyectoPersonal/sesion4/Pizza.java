package org.bedu.proyectoPersonal.sesion4;

import lombok.Data;
import org.bedu.proyectoPersonal.sesion3.MiInterfaz;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Pizza implements MiInterfaz {
    long id;
    String nombre;

    //@Autowired
    //Ingrediente ingrediente;

    @Override
    public String nombrarPizza() {
        return "La pizza se llama " + getNombre();
    }
}
