package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component //Para indicar que es un componente de la eplicacion principal
@Slf4j
public class TareasProgramadas {

    @Scheduled(fixedRate = 10000) //Para correr un metodo aunque no este instanciado en main
    //Y programar que pase cada cierto tiempo (5 segundos)
    public void saludar()
    {
        log.info("Hello bedu");
    }

    //Nunca corre porque no es llamada
    public void despedir()
    {
        log.info("Adios");
    }

    @Scheduled(fixedRate = 3000) //Para correr un metodo aunque no este instanciado en main
    //Y programar que pase cada cierto tiempo (5 segundos)
    public void holis()
    {
        log.info("Holis :D");
    }
}
