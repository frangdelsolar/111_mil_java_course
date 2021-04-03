/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;

/**
 *
 * @author frang
 */
public class Abuela {
    public String relacion;
    public String nombre;
    public int nietos;
    
    public Abuela(){
        
    }

    public Abuela(String relacion, String nombre, int nietos) {
        this.relacion = relacion;
        this.nombre = nombre;
        this.nietos = nietos;
    }
   
    public void cocina(){
        System.out.println("Abuela: Yo soy la " + relacion + " " + nombre + " y me gusta cocinar empanadas, para mis " + nietos + " nietos.");
    }
    
    public void visita(){
        System.out.println("Abuela: Soy la " + relacion + " " + nombre + ". Vengo de visita.");
    }
}
