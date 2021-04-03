/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private int maximoAlumnos;
    private List<Alumno> alumnos;
    private List<Float> notas;

    public Curso(String nombre, int maximoAlumnos, List<Alumno> alumnos, List<Float> notas) {
        this.nombre = nombre;
        this.maximoAlumnos = maximoAlumnos;
        this.alumnos = new ArrayList<Alumno>();
        this.notas = new ArrayList<Float>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public Boolean agregarAlumno(Alumno alumno){
        return true;
    }
    
    public List<Alumno> getAlumnos(){
        return this.alumnos;
    }
    
}
