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
public class Madre extends Abuela{
    public int hijos;

    public Madre() {
    }

    public Madre(int hijos) {
        this.hijos = hijos;
    }
        
    public Madre(int hijos, String relacion, String nombre, int nietos) {
        super(relacion, nombre, nietos);
        this.hijos = hijos;
    }
    
    @Override
    public void cocina(){
        System.out.println("Madre: Yo soy la " + relacion + " " + nombre + " y me gusta cocinar ravioles, para mis " + hijos + " hijos.");
    }
    
    public void cocinaSuper(){
        super.cocina();
    }
    
    @Override
    public void visita(){
        System.out.println("Madre: Soy la " + relacion + " " + nombre + ". Vengo de visita.");
    }

    public void visitaSuper(){
        super.visita();
    }    
    
}
