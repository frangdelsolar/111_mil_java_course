/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author frang
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a1 = new Animal("Caballo", 4, "La Pampa");
        a1.mostrarAtributos();
        
        Animal a2 = new Animal("Perro", 4, "todas partes");
        a2.mostrarAtributos();
        
        Elefante e1 = new Elefante(true, 400, true);
        e1.num_patas=4;
        e1.setRaza("Elefante");
        e1.ubicacion="Asia";        
        e1.mostrarAtributos();
        e1.mostrarElefante();
        
        Elefante e2 = new Elefante("Elefante", 4, "India", true,398, false);
        e2.mostrarElefante();      
        
    }
    
}
