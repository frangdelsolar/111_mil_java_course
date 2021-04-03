/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author frang
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        String obj1 = "Francisco";
        Integer obj2 =  9;
        
        a.add(obj1);
        a.add(obj2);
        a.add(obj1);
        
//        for(int i=0; i<a.size(); i++){
//            System.out.println("i = " + i + ", " + a.get(i));
//        }
//        a.remove(0);
//        
//        System.out.println("/////////////////////////////");
//        for(int i=0; i<a.size(); i++){
//            System.out.println("i = " + i + " " + a.get(i));
//        }
        
        System.out.println("//////////////   RELACIÓN   ///////////////");
        Profesor pf1 = new Profesor("Pérez");
        Asignatura as1 = new Asignatura("Matemática");
        Asignatura as2 = new Asignatura("Física");
        Asignatura as3 = new Asignatura("Química");

        as1.setImparte(pf1);
//        pf1.setImparte(as1);
        
        as2.setImparte(pf1);
//        pf1.setImparte(as2);
        
        as3.setImparte(pf1);
//        pf1.setImparte(as3);
        
//        ArrayList<Asignatura> as = new ArrayList();
//        as.add(as1);
//        as.add(as2);
//        as.add(as3);
//        
//        pf1.setImparte(as);
        
        pf1.getImparte().add(as1);
        pf1.getImparte().add(as2);        
        pf1.getImparte().add(as3);
        pf1.mostrar();

        System.out.println("-----   Removiendo asignatura    -----");       
        pf1.getImparte().remove(0);
        pf1.mostrar();
        
        
        System.out.println("-----   Utilizando el iterador    -----");
        Iterator<Asignatura> iteAs = pf1.getImparte().iterator();
        while(iteAs.hasNext()){
            System.out.println("* " + iteAs.next().nombre);
        }
        
        System.out.println(as1.sumar(45));
        
                
        


        
    }
    
}
