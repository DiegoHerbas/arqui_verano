package com.juanvladmir13.mvc.strategy;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class Context {
  private IDescuento strategy;

  public Context() {
    this.strategy = new Contado();
  }

  public void setStrategy(IDescuento strategy) {
    this.strategy = strategy;
  }

  public double precioFinalConDescuento(double precio) {
    return strategy.aplicarDescuento(precio);
  }

}
