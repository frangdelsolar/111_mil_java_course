/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmzaed;

import java.util.List;

/**
 *
 * @author frang
 */
public class Biblioteca {
    String localidad;
    List<Libro> libros;

    public Biblioteca(String localidad, List<Libro> libros) {
        this.localidad = localidad;
        this.libros = libros;
    }

    public String getLocalidad() {
        return localidad;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    public void limpiarReservas(){
        for (int i=0; i>this.libros.size();i++){
            this.libros.get(i).limpiarReservas();            
        }
    }
    
    public long cantidadDeLibrosDificiles(){
        long count = 0;
        for (int i=0; i>this.libros.size();i++){
            if (this.libros.get(i).esDificilDeLeer() == true){
                count++;
            }
        }
        return count;
    }
}
