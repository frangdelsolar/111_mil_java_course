/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.subpaquete;

import oop.Persona;
import oop.Vehiculo;

/**
 *
 * @author frang
 */

/*
    Calificadores de acceso - representación:
    - private = - = candado cerrado
    - public = + = candado abierto
    - protected = # = llave
    - friendly
    
    métodos setters and getters (establecer y obtener)
    si quiero acceder a un private -> ver: getNombre()
    si quiero modificar a un private -> modificar: setNombre()

    Métodos constructores o productores
    - su nombre es el nombre de la clase a la cual construye. Su nombre comienza
      con mayúscula.
*/


public class OOP {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        Persona per1 = new Persona();
        
        per1.nombre="Francisco";
        per1.setEdad(33);
        per1.estudios_cursados="Universitario completo";
        per1.setDni(32457071);
        
        System.out.println("Nombre: " + per1.nombre);
        System.out.println("Edad: " + per1.getEdad());
        System.out.println("Estudios: " + per1.estudios_cursados);
        System.out.println("DNI: " + per1.getDni());
        System.out.println("");
        
        Persona per2 = new Persona();
        
        per2.nombre="Javier";
        per2.setEdad(25);
        per2.estudios_cursados="Secundario completo";
        per2.setDni(48498566);
        
        System.out.println("Nombre: " + per2.nombre);
        System.out.println("Edad: " + per2.getEdad());
        System.out.println("Estudios: " + per2.estudios_cursados);
        System.out.println("DNI: " + per2.getDni());
        System.out.println("");
        
        Persona per3 = new Persona(88876091);
        System.out.println(per3.getDni());
        System.out.println("");
        
        Persona per4 = new Persona(123456789, "Jorge", 45, "Sec inc");
        System.out.println(per4);
        per4.show();
        
        per4.sumar(per2);
        
        Persona per5 = new Persona(123123123, "Juan", 87, null);
        
        Vehiculo auto = new Vehiculo("Ford", per1, 2010);
        auto.show();        
        
        Vehiculo moto = new Vehiculo(1990);
        moto.show();     
        
        
    }
    
}
