/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socios;

/**
 *
 * @author frang
 */
public class Socios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        A a1 = new A("ABC", 10, null);
//        A a2 = new A("BCD", 20, new B());
        B b1 = new B("Juan", 30);
        A a3 = new A("XYZ", 30, b1, null);
//        C c1 = new C("Perez", 45);
        C c2 = new C("Martínez", 60);
//        C c3 = new C("Fernández", 80);
        
        A a4 = new A("YUU", 10, b1, c2);


        
//        a1.mostrarAtributos();
//        a2.mostrarAtributos();
//        b1.mostrarAtributos();
//        a3.mostrarAtributos();
//        a3.rol1.mostrarAtributos();
        
//        a4.mostrarAtributos();
//        a4.rol2.mostrarAtributos();
        c2.rol3[0] = a4;
        c2.rol3[1] = a3;
       
//        c2.mostrarAtributos();
//        c2.rol3[0].mostrarAtributos();
//        System.out.println("Suma: " + a4.sumar());
//        System.out.println("Cuenta: " + c2.contar());
//        System.out.println("Cuenta desde a: " + a4.rol2.contar());

        B obj1B = new B("Predo", 40);
        obj1B.mostrarAtributos();
        
        B obj2B = new B(obj1B);
        obj2B.mostrarAtributos();


    }
    
}
