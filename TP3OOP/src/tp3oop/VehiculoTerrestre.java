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
public class VehiculoTerrestre extends Vehiculo{
    public int cantRuedas;
    public boolean tienePuertas;
    public int cantPasajeros;

    public VehiculoTerrestre() {
        super();
    }

    public VehiculoTerrestre(int cantRuedas, boolean tienePuertas, int cantPasajeros, String tipo, char tipoCombustible, float cantCombustible) {
        super(tipo, tipoCombustible, cantCombustible);
        this.cantRuedas = cantRuedas;
        this.tienePuertas = tienePuertas;
        this.cantPasajeros = cantPasajeros;
    }
    
    public void mostrarVT(){
        mostrar();
        System.out.println("Cantidad de ruedas: " + cantRuedas);
        if (tienePuertas == false){
            System.out.println("No tiene puertas");
        }
        System.out.println("Cantidad de pasajeros: " + cantPasajeros);
    }
    
    
    
}
