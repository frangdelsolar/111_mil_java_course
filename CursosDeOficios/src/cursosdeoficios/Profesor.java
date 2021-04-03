/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosdeoficios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author frang
 */
public class Profesor extends Persona{
    private List<String> especialidades;
    private int distanciaASede;
    private String telefono;
    
    public Profesor(String dni, 
                    String nombre, 
                    int distanciaASede, 
                    String telefono){
        super(dni, nombre);
        this.distanciaASede = distanciaASede;
        this.telefono=telefono;
        this.especialidades = new ArrayList<String>();
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public int getDistanciaASede() {
        return distanciaASede;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public void addEspecialidad(String especialidad){
        this.especialidades.add(especialidad);
    }
    
    public String toString(){
        return this.getDni() 
                + ", " + this.getNombre() 
                + ", " + this.getTelefono() 
                + ", " + this.getEspecialidades().size() 
                + ", " + this.getDistanciaASede();
    }
    
}
