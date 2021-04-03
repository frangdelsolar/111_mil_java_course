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
public class Perro extends Mascota {

  public Perro(String nombre, int edad) {
    super(nombre, edad);
  }

  @Override
  protected void hacerSonido() {
    ladrar();
  }

  public void ladrar() {
    System.out.println("guau guau");
  }
}