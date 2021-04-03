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
public class B {
    int edad;
    String nombre;

    public B() {
    }
    
    public B(B objetoB){ // Constructor de copia
        this.nombre = objetoB.nombre;
        this.edad = objetoB.edad;
    }

    public B(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public void mostrarAtributos(){
        System.out.println("##############");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("##############");
    }
    
}
