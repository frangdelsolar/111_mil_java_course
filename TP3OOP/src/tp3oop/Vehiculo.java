/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3oop;

/**
 *
 * @author frang
 */
public class Vehiculo {
    public String tipo;
    public char tipoCombustible;
    public float cantCombustible;
    protected float potencia;
    
    public float velocMaxima(){
        float velMax = 150;
        return velMax;
    }
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(String tipo, char tipoCombustible, float cantCombustible) {
        this.tipo = tipo;
        this.tipoCombustible = tipoCombustible;
        this.cantCombustible = cantCombustible;
    }
    
    public void mostrar(){
        System.out.println("/////////////////////////////");
        System.out.println("Tipo: " + tipo);
        System.out.println("Combustible: " + tipoCombustible);
        System.out.println("Cantidad de combustible: " + cantCombustible);
        System.out.println("Vel Máx: " + velocMaxima());
    }

    public char getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(char tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public float getCantCombustible() {
        return cantCombustible;
    }

    public void setCantCombustible(float cantCombustible) {
        this.cantCombustible = cantCombustible;
    }
    
}
