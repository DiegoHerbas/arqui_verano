package com.juanvladmir13.capas.negocio;

import com.juanvladmir13.capas.dato.DPelicula;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class NPelicula {

  private DPelicula dato;

  public NPelicula() {
    dato = new DPelicula();
  }

  public void setData(Map<String, String> map) {
    dato.setData(map);
  }

  public Object[] save() {
    return dato.save();
  }

  public boolean delete() {
    return dato.delete();
  }

  public Map<String, Object[]> list() {
    return dato.list();
  }

  public List<String> rowsToString() {
    return dato.rowsToString();
  }
}
