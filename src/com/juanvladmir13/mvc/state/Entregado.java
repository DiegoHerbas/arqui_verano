package com.juanvladmir13.mvc.state;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class Entregado extends IState {

  public Entregado(Context boleto) {
    super(boleto, "entregado");
  }

  @Override
  public void handleEntregado() {
    boleto.setInfo("Entregado");
  }

  @Override
  public void handlePagado() {
    boleto.setInfo("No valido");
  }

  @Override
  public void handleReservado() {
    boleto.setInfo("No valido");
  }

}
