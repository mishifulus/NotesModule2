package com.example.ejemplo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarFactory {

    @Bean
    Motor motor()
    {
        return new Motor();
    }

    @Bean
    Llantas llantas()
    {
        return new Llantas();
    }
}
