package org.bedu.proyectoPersonal.sesion3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class Comanda {
    @Autowired
    MiInterfaz miInterfaz;

    @PostConstruct
    public void pedir()
    {
        log.info("Necesito una pizza "+ miInterfaz.nombrarPizza());
    }
}
