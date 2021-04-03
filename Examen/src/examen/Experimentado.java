/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author frang
 */
class Experimentado implements Artista {
  int cantidadDePeliculas;
  
  Experimentado(int cantidadDePeliculas) {
    this.cantidadDePeliculas = cantidadDePeliculas;
  }
  
  public int sueldo() {
    //Completar acá
    return 9000 * cantidadDePeliculas;
  }
}
