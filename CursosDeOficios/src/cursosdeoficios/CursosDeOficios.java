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
public class CursosDeOficios {

    public static void main(String[] args) {
    
        
        Profesor profesor = new Profesor("30.000.001", "profesor", 100, "+54 (0375) 123456789");
        Curso c1 = new Curso("Programación Java", profesor, 2, "virtual");
        Curso c2 = new Curso("Electricidad", profesor, 3, "presencial");
        Curso c3 = new Curso("Carpintería", profesor, 1, "presencial");
        Alumno a1 = new Alumno("Posadas",  2016, "12.345.671", "Juan");
        Alumno a2 = new Alumno("El Dorado", 2017, "12.345.672", "Mirta");
        Alumno a3 = new Alumno("Posadas",  2018, "12.345.673", "María");
        c1.agregarAlumno(a1);
        c1.agregarAlumno(a2);
        c1.agregarAlumno(a3);
        c2.agregarAlumno(a1);
        c2.agregarAlumno(a2);
        c2.agregarAlumno(a3);
        c3.agregarAlumno(a1);
        c3.agregarAlumno(a2);
        c3.agregarAlumno(a3);
        System.out.println(c1.getAlumnos().size());
        System.out.println(c2.getAlumnos().size());
        System.out.println(c3.getAlumnos().size());
    }
    
}
