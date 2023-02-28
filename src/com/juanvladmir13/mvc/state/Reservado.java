package com.juanvladmir13.mvc.state;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class Reservado extends IState {

  public Reservado(Context boleto) {
    super(boleto, "reservado");
  }

  @Override
  public void handleEntregado() {
    boleto.setInfo("Entregado");
  }

  @Override
  public void handlePagado() {
    boleto.setState(boleto.getPagado());
  }

  @Override
  public void handleReservado() {
    boleto.setInfo("No valido");
  }
}
