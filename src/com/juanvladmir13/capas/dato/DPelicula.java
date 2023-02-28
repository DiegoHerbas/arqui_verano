package com.juanvladmir13.capas.dato;

import com.juanvladimir13.db.Memory;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class DPelicula {

  private String id;
  private String nombre;
  private int duracion;

  private Memory database;

  public DPelicula() {
    this.id = "";
    this.nombre = "";
    this.duracion = 0;

    this.database = new Memory();
  }

  public void setData(Map<String, String> map) {
    id = map.getOrDefault("id", "");
    nombre = map.getOrDefault("nombre", "");
    duracion = Integer.valueOf(map.getOrDefault("duracion", "0"));
  }

  public Object[] save() {
    Object[] row = {id, nombre, duracion};

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
