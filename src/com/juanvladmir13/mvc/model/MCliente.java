package com.juanvladmir13.mvc.model;

import com.juanvladimir13.db.Memory;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class MCliente {
  private String id;
  private String nombres;
  private String carnet;

  private Memory database;

  public MCliente() {
    this.id = "";
    this.nombres = "";
    this.carnet = "";

    this.database = new Memory();
  }

  public void setData(Map<String, String> map) {
    id = map.getOrDefault("id", "");
    nombres = map.getOrDefault("nombres", "");
    carnet = map.getOrDefault("carnet", "");
  }

  public Object[] save() {
    Object[] row = {id, nombres, carnet};

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
