package com.example.ejemplo2;

import lombok.Data;

@Data
public class TickerResponse {
    Boolean success;
    Ticker payload;
}
