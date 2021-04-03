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
public class Cuento extends Libro{

    public Cuento(String titulo, String autor, int cantidadDeReservas) {
        super(titulo, autor, cantidadDeReservas);
    }
    
    public boolean esDificilDeLeer(){
        return false;
    }
}


// SELECT autor FROM libros WHERE id_biblioteca.localidad=Mendoza