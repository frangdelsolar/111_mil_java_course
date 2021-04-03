/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

public class Asignatura implements Abc {
    
    public String nombre;
    private Profesor imparte;
    public Grupo recibe;
    
    public Asignatura(){        
    }
    
    public Asignatura(String nombre){
        this.nombre = nombre;
    }

    public Asignatura(String nombre, Profesor imparte, Grupo recibe) {
        this.nombre = nombre;
        this.imparte = imparte;
        this.recibe = recibe;
    }
    
    public void setImparte(Profesor prof){
        this.imparte = prof;
    }
    
    public Profesor getImparte(){
        return this.imparte;
    }
    
    @Override
    public int sumar(float m){
        return (int)(m) + Z;
    }
    
    @Override
    public void mostrar(){
        System.out.print(this.nombre + ", ");
        System.out.println("Prof. " + this.imparte.nombre);
//        System.out.println(this.recibe.curso);
    }
    
    
}
