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
public class Animal {
    private String raza;
    public int num_patas;
    protected String ubicacion;
    
    public Animal(){
        
    }

    public Animal(String raza, int num_patas, String ubicacion) {
        this.raza = raza;
        this.num_patas = num_patas;
        this.ubicacion = ubicacion;
    }
        
    public void mostrarAtributos(){
        System.out.println("////////////////////////");
        System.out.println("Soy un/a " + raza);
        System.out.println("Tengo " + num_patas + " patas.");
        System.out.println("Vivo en " + ubicacion);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
      
    
}
