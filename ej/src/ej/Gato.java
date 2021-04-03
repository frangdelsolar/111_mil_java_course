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
public class Gato extends Mascota {

  public Gato(String nombre, int edad) {
    super(nombre, edad);
  }

  @Override
  protected void hacerSonido() {
    maullar();
  }

  public void maullar() {
    System.out.println("miaaaau");
  }
}

