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
public class Hija extends Madre{
    public int edad;

    public Hija() {
    }

    public Hija(int edad) {
        this.edad = edad;
    }

    public Hija(int edad, int hijos, String relacion, String nombre, int nietos) {
        super(hijos, relacion, nombre, nietos);
        this.edad = edad;
    }
    
    @Override
    public void cocina(){
        System.out.println("Hija: Yo soy la " + relacion + " " + nombre + " y no sé cocinar.");
    }
    
    public void cocinaMadre(){
        super.cocina();
    }
    
    public void cocinaAbuela(){
        super.cocinaSuper();
    }
    
    @Override
    public void visita(){
        System.out.println("Hija: Soy la " + relacion + " " + nombre + ". Vengo de visita.");
    }

    public void visitaMadre(){
        super.visita();
    }     
    
    public void visitaAbuela(){
        super.visitaSuper();
    }  
}
