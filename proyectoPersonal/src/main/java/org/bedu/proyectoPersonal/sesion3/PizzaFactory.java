package org.bedu.proyectoPersonal.sesion3;

import org.bedu.proyectoPersonal.sesion4.Ingrediente;
import org.bedu.proyectoPersonal.sesion4.Pizza;

public class PizzaFactory {
    public Pizza hacerPizza()
    {
        Pizza pizza = new Pizza();
        pizza.setId(1);
        pizza.setNombre("Hawaina");
        return pizza;
    }
}
