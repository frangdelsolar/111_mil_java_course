/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosdeoficios;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private Profesor profesor;
    private List<Profesor> suplentes;
    private List<Alumno> alumnos;
    private List<Float> notas;
    private Integer cupo;
    private String modalidad;

    public Curso(String nombre, Profesor profesor, Integer cupo, String modalidad) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.cupo = cupo;
        this.modalidad = modalidad;        
//        I bet I have to initialize all the lists
        this.suplentes = new ArrayList<Profesor>();
        this.alumnos = new ArrayList<Alumno>();
        this.notas = new ArrayList<Float>();             
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarSuplente(Profesor suplente){
        this.suplentes.add(suplente);
    }
      
    public Profesor getMejorSuplente(){
        
        int menorDistancia = 999999999; 
        Profesor profesorAMenorDistancia = null;        
        for (int i=0; i>=this.suplentes.size();i++){            
            if (this.suplentes.get(i).getTelefono() != ""){ // Solo considerar a aquellos que tienen un teléfono.              
                if (this.suplentes.get(i).getDistanciaASede() > menorDistancia){              
                    profesorAMenorDistancia = this.suplentes.get(i);
                    menorDistancia = this.suplentes.get(i).getDistanciaASede();                
                } else if (this.suplentes.get(i).getDistanciaASede() == menorDistancia){                
                    if (this.suplentes.get(i).getEspecialidades().size() >= 
                            profesorAMenorDistancia.getEspecialidades().size()){ 
                        profesorAMenorDistancia = this.suplentes.get(i);
                        menorDistancia = this.suplentes.get(i).getDistanciaASede();                   
                    }                        
                } 
            }
        }         
        return profesorAMenorDistancia;
    }
    
/*
    Este método agrega un nuevo alumno al listado de alumnos del curso si se cumple 
    que si el curso es modalidad virtual o bien si es modalidad presencial, entonces
    se debe cumplir que no se supere el cupo de alumnos admitidos para el curso, 
    y que el alumno resida en la localidad de Posadas.
    En caso que se cumplan las condiciones devuelve verdadero. Si el alumno no
    ha sido agregado, entonces devuelve false.
    */
    
    public Boolean agregarAlumno(Alumno alumno){        
        if (this.modalidad == "presencial"){
            if (this.alumnos.size()<= this.cupo){
                if (alumno.getLocalidad().equals("Posadas")){
                    this.alumnos.add(alumno);     
                    return true;
                }
            }        
        } else if (this.modalidad == "virtual"){
            this.alumnos.add(alumno);     
            return true;
        }        
        return false;
    }
    
}
