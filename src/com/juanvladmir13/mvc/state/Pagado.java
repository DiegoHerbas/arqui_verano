package com.juanvladmir13.mvc.state;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class Pagado extends IState {

  public Pagado(Context boleto) {
    super(boleto, "pagado");
  }

  @Override
  public void handleEntregado() {
    boleto.setState(boleto.getEntregado());
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
