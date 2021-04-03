/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author frang
 */
public abstract class Figura {
    
    protected float espesor;
    public static final float PRECIO = 5.35F;
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Figura(float espesor, int numero) {
        this.espesor = espesor;
        this.numero = numero;
    }
    
    public Figura(){}
    
    public Figura (float espesor){
        this.espesor = espesor;
    }
    
    public abstract double superficie();
   
    public abstract double perimetro();
    
    public float costo(){
        return (float) superficie() * espesor * PRECIO;
    }
}
