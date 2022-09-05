package com.example.ejemplo1;

import com.example.ejemplo1.data.Cita;
import com.example.ejemplo1.data.CitaRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Controller
@Slf4j
public class CitaController {
    private final CitaRepositorio citaRepository;

    @Autowired
    public CitaController(CitaRepositorio citaRepository) {
        this.citaRepository = citaRepository;
    }

    @PostConstruct
    public void Hola()
    {
        log.info("Hola desde el controlador");
        for (Cita cita: citaRepository.encuentraTodos())
        {
            log.info(cita.getTexto());
        }
    }

}
