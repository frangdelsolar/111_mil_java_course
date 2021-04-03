/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{
    private int cantidadHoras;
    private float sueldo;
    private List<Curso> cursosDictados;

    public Profesor(int cantidadHoras, float sueldo, List<Curso> cursosDictados, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.cantidadHoras = cantidadHoras;
        this.sueldo = sueldo;
        this.cursosDictados = new ArrayList<Curso>();
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void addCurso(Curso curso){
        this.cursosDictados.add(curso);
    }
    
    public List<Curso> obtenerCursosConIngresanteAnterioresA (int añoDeIngreso){
        
    }
    
    
}
