package org.bedu.ejemplo1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaccion {
    Long id;
    String price;
    String qty;
    String quoteQty;
    Long time;
    Boolean isBuyerMaker;
    Boolean isBestMatch;

}
