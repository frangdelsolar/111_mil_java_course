/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej;

/**
 *
 * @author frang
 */
public abstract class Mascota {

  private final String nombre;
  protected int edad;

  public Mascota(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  protected abstract void hacerSonido();

  public void hacerRuido() {
    hacerSonido();
    hacerSonido();
    hacerSonido();
  }
}