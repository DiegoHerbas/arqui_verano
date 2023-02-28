package com.juanvladmir13.mvc.strategy;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public class Tarjeta implements IDescuento {

  @Override
  public double aplicarDescuento(double precio) {
    return (precio * 0.15);
  }

}
