/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3oop;

/**
 *
 * @author frang
 */
public class Moto extends VehiculoTerrestre{
    public boolean tienePuertas = false;
    public int cantRuedas = 2;
    
    public Moto(){        
    }

    public Moto(boolean tienePuertas,  int cantRuedas, int cantPasajeros, char tipoCombustible, float cantCombustible) {
        super(cantRuedas, tienePuertas, cantPasajeros, tipoCombustible, cantCombustible);
        this.tienePuertas = tienePuertas;
    }
    
    public void mostrarMoto(){
        mostrarVT();
        System.out.println("Puede llevar " + cantPasajeros + "pasajeros.");
    }
    
    
}