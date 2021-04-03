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
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Persona p1 = new Persona("Francisco", 33);
//        
//        System.out.println(p1);
//        System.out.println(p1.getEdad());
//        
//        p1.cumplirAnios();
//        System.out.println(p1.getEdad());
        Principiante yo = new Principiante();
        System.out.println(yo.sueldo());
        
        Experimentado ricardoDarin = new Experimentado(56);
        System.out.println(ricardoDarin.sueldo());
        
    }
    
}


//SELECT documento 
//FROM alumnos a, escuelas e
//WHERE a.id_escuela = e.id_escuela
//AND a.promedio > 6
//AND e.localidad = 'Mendoza';