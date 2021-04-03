/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona{
    
    private int añoDeIngreso;
    private List<Curso> cursadas;

    public Alumno(int añoDeIngreso, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.añoDeIngreso = añoDeIngreso;
        this.cursadas = new ArrayList<Curso>();
    }
    
    public int getAñoDelIngreso(){
        return this.añoDeIngreso;
    }
    
    public void addCurso(Curso curso){
        this.cursadas.add(curso);
    }
}