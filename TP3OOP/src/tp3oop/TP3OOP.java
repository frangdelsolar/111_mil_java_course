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
public class TP3OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculo v1 = new Vehiculo();
        v1.mostrar();
        
        VehiculoTerrestre t1 = new VehiculoTerrestre(4, true, 4, 's', 45);
        t1.mostrarVT();
        
        Coche c1 = new Coche(true, 5, 4, 8, 's', 45);
        c1.mostrarCoche();

    }
    
}
