/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redefinicion;

/**
 *
 * @author frang
 */
public class Redefinicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        claseA obj1 = new claseA(1);
        claseB obj2 = new claseB(2, 5);
        claseC obj3 = new claseC(3, 2, 1);
        
        System.out.println("contar de A: " + obj1.contar());
        System.out.println("contar de B: " + obj2.contar());
        System.out.println("contar de A desde B: " + obj2.contar_de_super());
        
        obj1.saludar();
        obj2.saludar();
        
        System.out.println("contar de c: " + obj3.contar());
        System.out.println("contar de b desde c: " + obj3.contar_de_B());
        
        obj3.saludar();
        obj3.superSaludo();
        obj3.superSuperSaludo();
        
    }
    
}
