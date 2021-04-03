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
public class Coche extends VehiculoTerrestre{
    public boolean tienePuertas = true;
    public int cantPuertas = 4;
    public int cantRuedas = 4;
    
    public Coche(){
        
    }

    public Coche(boolean tienePuertas, int cantPuertas, int cantRuedas, int cantPasajeros, char tipoCombustible, float cantCombustible) {
        super(cantRuedas, tienePuertas, cantPasajeros, tipoCombustible, cantCombustible);
        this.tienePuertas = tienePuertas;
        this.cantPuertas = cantPuertas;
    }
    
    public void mostrarCoche(){
        mostrarVT();
        System.out.println("Tiene " + cantPuertas + " puertas");
    }
    
    
}
