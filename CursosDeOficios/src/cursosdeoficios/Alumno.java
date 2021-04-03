/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosdeoficios;

/**
 *
 * @author frang
 */
public class Alumno extends Persona{
    private String Localidad;
    private Integer añoIngreso;

    public Alumno(String Localidad, 
                  Integer añoIngreso, 
                  String dni, 
                  String nombre) {
        super(dni, nombre);
        this.Localidad = Localidad;
        this.añoIngreso = añoIngreso;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public Integer getAñoIngreso() {
        return añoIngreso;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
