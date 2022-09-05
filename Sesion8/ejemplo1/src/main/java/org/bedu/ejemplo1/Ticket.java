package org.bedu.ejemplo1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ticket {
    String symbol;
    String priceChange;
    String priceChangePercent;
    String weightedAvgPrice;
    String prevClosePrice;
    String lastPrice;
    String lastQty;
    String bidPrice;
    String bidQty;
    String askPrice;
    String askQty;
    String openPrice;
    String highPrice;
    String lowPrice;
    String volume;
    String quoteVolume;
    Long openTime;
    Long closeTime;
    Long firstId;
    Long lastId;
    Long count;
}
