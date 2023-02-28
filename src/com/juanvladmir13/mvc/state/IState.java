package com.juanvladmir13.mvc.state;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public abstract class IState {

  protected Context boleto;
  private String nombre;

  public IState(Context boleto, String nombre) {
    this.boleto = boleto;
    this.nombre = nombre;
  }

  public abstract void handleEntregado();

  public abstract void handlePagado();

  public abstract void handleReservado();

  public String getNombre() {
    return nombre;
  }

}
