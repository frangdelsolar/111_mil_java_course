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
abstract class Libro {
    String titulo;
    String autor;
    int cantidadDeReservas;

    public Libro() {
    }

    public Libro(String titulo, String autor, int cantidadDeReservas) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDeReservas = cantidadDeReservas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantidadDeReservas() {
        return cantidadDeReservas;
    }

    public void setCantidadDeReservas(int cantidadDeReservas) {
        this.cantidadDeReservas = cantidadDeReservas;
    }
    
    public void registrarReserva(){
        this.cantidadDeReservas += 1;
    }
    
    public void limpiarReservas(){
        this.cantidadDeReservas = 0;
    }
    
    abstract boolean esDificilDeLeer();

}
