/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author frang
 */
public class Vehiculo {
    
    public String make;
    private Persona owner; 
    public final int model; 
    
    
    public Vehiculo(int model){
        this.model=model;
    }
    
    public Vehiculo(String make, Persona owner, int model){
        this.make = make;
        this.owner = owner;
        this.model = model;
    }
    
    public void show(){
        System.out.println("Marca: " + make);
        System.out.println("Dueño: " + owner.nombre + ", "+ owner.getDni());
        System.out.println("Modelo: " + model);
        System.out.println("------------------------------------------");
    }
    
    
    public void setOwner(Persona owner){
        this.owner = owner;
    }
    

    
    
}
