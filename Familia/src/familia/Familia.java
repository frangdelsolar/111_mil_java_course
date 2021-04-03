/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;

/**
 *
 * @author frang
 */
public class Familia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Abuela abu = new Abuela("Abuela", "Norma", 5);
        Madre mama = new Madre(2, "Madre", "María", 0);
        Hija nena = new Hija(5, 0, "Hija", "Sol", 0);
        
        System.out.println("Métodos Abuela");
        abu.cocina();
        abu.visita();
        System.out.println("//////////////////");
        
        System.out.println("Métodos Madre");
        mama.cocina();
        mama.visita();
        mama.cocinaSuper();
        mama.visitaSuper();
        System.out.println("//////////////////");
                
        System.out.println("Métodos Hija");
        nena.cocina();
        nena.visita();
        nena.cocinaSuper();
        nena.visitaSuper();
        nena.cocinaMadre();
        nena.visitaMadre();
        nena.cocinaAbuela();
        nena.visitaAbuela();
        System.out.println("//////////////////");        
        
    }
    
}
