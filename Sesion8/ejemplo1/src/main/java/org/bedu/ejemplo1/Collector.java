package org.bedu.ejemplo1;

import lombok.extern.slf4j.Slf4j;
import org.bedu.ejemplo1.data.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class Collector {

    @Autowired //Detectado como atributo
    private RestTemplate restTemplate;

    @Autowired
    private Repositorio repositorio;

    static final String baseUrl = "https://api.binance.com";
    static final String symbol = "BTCUSDT";

    /*@Scheduled(fixedRate = 5, timeUnit = TimeUnit.MINUTES)
    private void obtenerTransacciones()
    {
        //Se crea la liga para consumir la API con la base URL y el parametro symbol
        UriComponents result = UriComponentsBuilder.fromHttpUrl(baseUrl + "/api/v3/trades")
                .queryParam("symbol", symbol).build();

        Transaccion[] transacciones =
                restTemplate.getForObject(result.toString(), Transaccion[].class);

        for (Transaccion transaccion : transacciones)
        {
            log.info("{}",transacciones.toString());
            repositorio.guardarTransaccion(transaccion);
        }
    }*/

    @Scheduled(fixedRate = 10, timeUnit = TimeUnit.SECONDS)
    private void obtenerNumeroTrades()
    {
        UriComponents result = UriComponentsBuilder.fromHttpUrl(baseUrl + "/api/v3/ticker/24hr")
                .queryParam("symbol", symbol).build();

        Ticket[] tickets =
                restTemplate.getForObject(result.toString(), Ticket[].class);

        for (Ticket ticket : tickets)
        {
            log.info("{}",tickets.toString());
            repositorio.guardarNumeroTrades(ticket);
        }
    }

}
