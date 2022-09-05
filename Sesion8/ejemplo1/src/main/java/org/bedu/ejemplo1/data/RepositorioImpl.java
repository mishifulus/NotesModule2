package org.bedu.ejemplo1.data;

import org.bedu.ejemplo1.Ticket;
import org.bedu.ejemplo1.Transaccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RepositorioImpl implements Repositorio{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void guardarTransaccion(Transaccion transaccion) {
        jdbcTemplate.update("INSERT into transaccion(id, price, qty, quoteQty, time, isBuyerMaker, isBestMatch) VALUES (?,?,?,?,?,?,?)",
        transaccion.getId(),
        transaccion.getPrice(),
        transaccion.getQty(),
        transaccion.getQuoteQty(),
        transaccion.getTime(),
        transaccion.getIsBuyerMaker(),
        transaccion.getIsBestMatch()
        );

    }

    @Override
    public List<Transaccion> obtenerTransacciones() {
        return jdbcTemplate.query("SELECT * FROM transaccion", this::mapRowToTransaccion);
    }

    private Transaccion mapRowToTransaccion(ResultSet resultSet, int rowNum) throws SQLException {
        return new Transaccion(
                resultSet.getLong("id"),
                resultSet.getString("price"),
                resultSet.getString("qty"),
                resultSet.getString("quoteQty"),
                resultSet.getLong("time"),
                resultSet.getBoolean("isBuyerMaker"),
                resultSet.getBoolean("isBestMatch")
        );
    }

    @Override
    public void guardarNumeroTrades(Ticket ticket) {
        jdbcTemplate.update("INSERT into ticket(symbol, priceChange, priceChangePercent, weightedAvgPrice, prevClosePrice, lastPrice, lastQty, bidPrice, bidQty, askPrice, askQty, openPrice, highPrice, lowPrice, volume, quoteVolume, openTime, closeTime, firstId, lastId, count) " +
                        "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                ticket.getSymbol(),
                ticket.getPriceChange(),
                ticket.getPriceChangePercent(),
                ticket.getWeightedAvgPrice(),
                ticket.getPrevClosePrice(),
                ticket.getLastPrice(),
                ticket.getLastQty(),
                ticket.getBidPrice(),
                ticket.getBidQty(),
                ticket.getAskPrice(),
                ticket.getOpenPrice(),
                ticket.getHighPrice(),
                ticket.getLowPrice(),
                ticket.getVolume(),
                ticket.getQuoteVolume(),
                ticket.getOpenTime(),
                ticket.getCloseTime(),
                ticket.getFirstId(),
                ticket.getLastId(),
                ticket.getCount()
        );
    }

    @Override
    public List<Ticket> obtenerNumeroTrades() {
        return jdbcTemplate.query("SELECT * FROM ticket", this::mapRowToTicket);
    }

    private Ticket mapRowToTicket(ResultSet resultSet, int rowNum) throws SQLException {
        return new Ticket(
                resultSet.getString("symbol"),
                resultSet.getString("priceChange"),
                resultSet.getString("priceChangePercent"),
                resultSet.getString("weightedAvgPrice"),
                resultSet.getString("prevClosePrice"),
                resultSet.getString("lastPrice"),
                resultSet.getString("lastQty"),
                resultSet.getString("bidPrice"),
                resultSet.getString("bidQty"),
                resultSet.getString("askPrice"),
                resultSet.getString("askQty"),
                resultSet.getString("openPrice"),
                resultSet.getString("highPrice"),
                resultSet.getString("lowPrice"),
                resultSet.getString("volume"),
                resultSet.getString("quoteVolume"),
                resultSet.getLong("1661735799810"),
                resultSet.getLong("1661822199810"),
                resultSet.getLong("1716786595"),
                resultSet.getLong("1722475965"),
                resultSet.getLong("5689371")
        );
    }
}
