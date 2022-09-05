package com.example.ejemplo1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component //Agrega funcionalidad a la clase principal
@Slf4j
public class NecesitoUnaClase {
    @Autowired //Especifica que es una inyeccion de dependencia, para remplazar el constructor
    MiInterface miInterface;

    //Dependency
    /*public NecesitoUnaClase (MiInterface miInterface)
    {
        this.miInterface = miInterface;
    }*/

    //Donde se necesita la dependencia
    @PostConstruct
    public void mensaje()
    {
        log.info("Necesito una clase "+ miInterface.miMetodo());
    }
}
