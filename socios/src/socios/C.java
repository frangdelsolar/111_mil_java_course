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
public class C {
    int edad;
    String nombre;
    A rol3[] = new A[10];
            
    public C() {
    }

    public C(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public void mostrarAtributos(){
        System.out.println("##############");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        if (this.rol3[0] != null){
            System.out.println("rol3[0] " + rol3[0]);
        }
        System.out.println("##############");
    }
    
    public int contar(){
        int cuenta = 0;
        for (int i=0; i<rol3.length; i++){
            if (rol3[i] != null){
                cuenta++;
            } else {
                break;
            }
        }
        return cuenta;
    }
    
}
