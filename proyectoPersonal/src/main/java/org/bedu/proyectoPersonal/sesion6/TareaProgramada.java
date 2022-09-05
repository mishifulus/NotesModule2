package org.bedu.proyectoPersonal.sesion6;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class TareaProgramada {

    @Autowired
    RestTemplate restTemplate;

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
}
