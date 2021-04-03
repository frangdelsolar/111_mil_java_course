/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author frang
 */
public class Elefante extends Animal{
    public boolean colmillosMarfil;
    protected int peso;
    public boolean peligroExtincion;
    
    public Elefante(){
        super();
    }
    
    public Elefante(boolean colmillos, int peso, boolean peligroExtincion){
        super();
        this.colmillosMarfil = colmillos;
        this.peso = peso;
        this.peligroExtincion = peligroExtincion;
    }
    
    public Elefante(String raza, int num_patas, String ubicacion, boolean colmillos, int peso, boolean peligroExtincion){
        super(raza, num_patas, ubicacion);
        this.colmillosMarfil = colmillos;
        this.peso = peso;
        this.peligroExtincion = peligroExtincion;
    }

    public boolean isColmillosMarfil() {
        return colmillosMarfil;
    }

    public void setColmillosMarfil(boolean colmillosMarfil) {
        this.colmillosMarfil = colmillosMarfil;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isPeligroExtincion() {
        return peligroExtincion;
    }

    public void setPeligroExtincion(boolean peligroExtincion) {
        this.peligroExtincion = peligroExtincion;
    }
    
    public void mostrarElefante(){
        mostrarAtributos();
        System.out.println("Colmillos: " + colmillosMarfil);
        System.out.println("Extinción: " + peligroExtincion);
        System.out.println("Peso: " + peso);
    }
}
