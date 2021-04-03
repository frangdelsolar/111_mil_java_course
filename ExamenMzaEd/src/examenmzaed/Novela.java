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
public class Novela extends Libro{
    int cantidadDePaginas;

    public Novela(int cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }

    public Novela(int cantidadDePaginas, String titulo, String autor, int cantidadDeReservas) {
        super(titulo, autor, cantidadDeReservas);
        this.cantidadDePaginas = cantidadDePaginas;
    }
    
    public boolean esDificilDeLeer(){
        if (this.cantidadDePaginas>500){
            return true;
        }
        else{
            return false;
        }
    }
}
