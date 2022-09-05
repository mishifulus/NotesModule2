package com.example.ejemplo1.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcCitaRepository implements CitaRepositorio{

    private JdbcTemplate jdbc;

    @Autowired
    public JdbcCitaRepository(JdbcTemplate jdbc)
    {
        this.jdbc = jdbc;
        //Para generar bases de datos con cierto formato
    }

    @Override
    public Iterable<Cita> encuentraTodos() {
        return jdbc.query("SELECT * FROM cita", this::mapRowToCita);
        //Generamos la consulta SQL para devolver objetos tipo cita, y los mapeamos para el formato
    }

    //La excepcion SQL para cualquier error en la base de datos
    private Cita mapRowToCita(ResultSet resultSet, int rowNum) throws SQLException
    {
        // Para devolver null si no hay datos
        //if (rowNum == 0) return null;

        return  new Cita(
                resultSet.getString("nombre"),
                resultSet.getString("libro"),
                resultSet.getString("texto")
        );
        /*
        Para obtener un mapeado:
        {
            "nombre" : "Nombre1",
            "libro" : "Libro1",
            "texto" : "Textito1"
         }
         */
    }

    @Override
    public Cita guardar(Cita cita) {
        jdbc.update("INSERT INTO Cita(nombre, libro, texto) VALUES (?,?,?)",
                cita.getNombre(),
                cita.getLibro(),
                cita.getTexto());
        //Insercion a SQL, y regresamos el objeto insertado para asegurarnos que todo funciona
        return cita;
    }

    @Override
    public Cita encontrarPorNombre(String nombre){
        Iterable<Cita> result= jdbc.query("select * from cita where nombre = " + nombre, this::mapRowToCita);
        Cita c = null;
        for (Cita e : result){
            c = e;
        }
        return c;
    }
}
