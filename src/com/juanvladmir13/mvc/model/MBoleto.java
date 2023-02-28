package com.juanvladmir13.mvc.model;

import com.juanvladimir13.db.Memory;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class MBoleto {

  private String id;
  private String numero;
  private String fecha;
  private String horaInicio;
  private String numeroAsiento;
  private String formaDePago;
  private double precio;
  private double descuento;

  private String pelicula_id;
  private String cliente_id;

  private Memory database;

  public MBoleto() {
    this.id = "0";
    this.numero = "";
    this.fecha = "";
    this.horaInicio = "";
    this.numeroAsiento = "";
    this.formaDePago = "";
    this.precio = 0;
    this.descuento = 0;

    this.pelicula_id = "0";
    this.cliente_id = "0";

    this.database = new Memory();
  }

  public void setData(Map<String, String> map) {
    id = map.getOrDefault("id", "");
    numero = map.getOrDefault("numero", "");
    fecha = map.getOrDefault("fecha", "");
    horaInicio = map.getOrDefault("horaInicio", "");
    numeroAsiento = map.getOrDefault("numeroAsiento", "0");

    formaDePago = map.getOrDefault("formaDePago", "");
    precio = Double.valueOf(map.getOrDefault("precio", "0"));
    descuento = Double.valueOf(map.getOrDefault("descuento", "0"));
    pelicula_id = map.getOrDefault("pelicula_id", "0");
    cliente_id = map.getOrDefault("cliente_id", "0");
  }

  public Object[] save() {
    Object[] row = {id, numero, fecha, horaInicio, numeroAsiento, formaDePago, precio, descuento, pelicula_id, cliente_id};

    if (!id.isEmpty()) {
      return database.update(row);
    } else {
      return database.insert(row);
    }
  }

  public boolean delete() {
    return database.delete(this.id);
  }

  public Map<String, Object[]> list() {
    return database.select();
  }

  public List<String> rowsToString() {
    return database.rowsToString();
  }
}
