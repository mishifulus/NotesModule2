package org.bedu.ejemplo1.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.bedu.ejemplo1.Transaccion;
import org.bedu.ejemplo1.data.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MiControlador {

    @Autowired
    private final Repositorio repositorio;

    @GetMapping(value = "/promedio", produces = "application/json")
    public String promedio()
    {
        List<Transaccion> transacciones = repositorio.obtenerTransacciones();

        Double promedio = 0.0;
        int numeroTransacciones = 0;

        for (Transaccion transaccion : transacciones)
        {
            numeroTransacciones++;
            promedio += Double.valueOf(transaccion.getPrice());
        }

        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("promedio", String.valueOf(promedio/numeroTransacciones));

        ObjectMapper objectMapper = new ObjectMapper();
        String json = "";
        try {
            json = objectMapper.writeValueAsString(respuesta);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return json;
    }
}
