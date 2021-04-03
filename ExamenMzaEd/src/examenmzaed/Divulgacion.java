/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmzaed;

/**
 *
 * @author frang
 */
public class Divulgacion extends Libro{
    String tematica;

    public Divulgacion(String titulo, String autor, int cantidadDeReservas) {
        super(titulo, autor, cantidadDeReservas);
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
    
    

    public boolean esDificilDeLeer(){
        if (this.tematica=="matemática"||this.tematica=="astronomía"){
            return true;
        }
        else{
            return false;
        }
    }
}