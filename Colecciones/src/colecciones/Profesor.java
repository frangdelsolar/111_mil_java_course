/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;


public class Profesor {
    
    public String nombre;
    private ArrayList<Asignatura> imparte = new ArrayList();

    public Profesor() {
    }

    public Profesor(String nombre) {
        this.nombre = nombre;
        }

    public void setImparte(ArrayList<Asignatura> imparte) {
        this.imparte = imparte;
    }

    public ArrayList<Asignatura> getImparte() {
        return imparte;
    }
       
    public void mostrar(){
        System.out.println("Profesor");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Asignaturas: ");
        
        for (int i=0; i<this.imparte.size(); i++){
            System.out.print("* ");
            this.imparte.get(i).mostrar();
        }
        
    }
    
}
