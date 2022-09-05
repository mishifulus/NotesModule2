package com.example.ejemplo2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.tags.form.TextareaTag;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class TareaProgramada {

    @Autowired
    RestTemplate restTemplate;

    /*@Scheduled(fixedRate = 30, timeUnit =  TimeUnit.SECONDS)
    public void getTexto()
    {
        String uri = "https://jsonplaceholder.typicode.com/posts";
        UriComponents builder = UriComponentsBuilder.fromHttpUrl(uri)
                .queryParam("userId", 1).build();
        // Igual a  https://jsonplaceholder.typicode.com/posts?userId=1

        Texto[] textos =
                restTemplate.getForObject(builder.toUriString(), Texto[].class);

        for(Texto texto : textos)
        {
            log.info("titulo: {} \n body: {}", texto.getTitle(), texto.getBody());
        }
    }*/

    @Scheduled(fixedRate = 30, timeUnit =  TimeUnit.SECONDS) //Realiza el get cada 30 segundos
    public void getBooks()
    {
        AvailableBooks availableBooks =
                restTemplate.getForObject("https://api.bitso.com/v3/available_books/", AvailableBooks.class);
        log.info(availableBooks.toString());

        for(Book book: availableBooks.getPayload()) {
            log.info("book {}: maximum price: ${}", book.getBook(), book.getMaximum_price());
        }
    }

    /*@Scheduled(fixedRate = 30, timeUnit =  TimeUnit.SECONDS) //Realiza el get cada 30 segundos
    public void getTicker()
    {
        String uri = "https://api.bitso.com/v3/ticker/";

        UriComponents builder = UriComponentsBuilder.fromHttpUrl(uri)
                .queryParam("book", "btc_mxn").build();

        TickerResponse tickerResponse =
                restTemplate.getForObject(builder.toUriString(), TickerResponse.class);
        log.info("{} cambio ${} en las ultimas 24 horas", tickerResponse.getPayload().getBook(), tickerResponse.getPayload().change_24);
    }*/

    /*@Scheduled(fixedRate = 30, timeUnit =  TimeUnit.SECONDS)
    public void testWithPostMethod()
    {
        Informacion request = new Informacion();
        request.setAutor("Nicolas Boites");
        request.setLibro("Aprender a aprender");
        request.setCita("Aprender puede ser un metodo");


        Informacion informacionResponse =
                restTemplate.postForObject("https://jsonplaceholder.typicode.com/posts", request, Informacion.class);

        log.info(informacionResponse.toString());
    }*/

    /*@Scheduled(fixedRate = 30, timeUnit =  TimeUnit.SECONDS)
    public void pruebaTextos()
    {
        Texto request = new Texto();
        request.setId(127);
        request.setUserId(2);
        request.setBody("Holis");
        request.setTitle("Saludo");

        Texto textoResponse =
                restTemplate.postForObject("https://jsonplaceholder.typicode.com/posts", request, Texto.class);

        log.info(textoResponse.toString());
    }*/

}
