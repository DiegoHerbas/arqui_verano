package com.juanvladmir13.mvc.state;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class Context {
  private String info;

  private IState entregado;
  private IState pagado;
  private IState reservado;

  private IState state;

  public Context() {
    this.reservado = new Reservado(this);
    this.pagado = new Pagado(this);
    this.entregado = new Entregado(this);
    this.state = reservado;
    this.info = "";
  }

  public void requestReservado() {
    this.state.handleReservado();
  }

  public void requestPagado() {
    this.state.handlePagado();
  }

  public void requestEntregado() {
    this.state.handleEntregado();
  }

  public void setState(IState state) {
    this.state = state;
  }

  public IState getEntregado() {
    return entregado;
  }

  public IState getPagado() {
    return pagado;
  }

  public IState getReservado() {
    return reservado;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }
}
