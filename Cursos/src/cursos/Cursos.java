/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos;

/**
 *
 * @author frang
 */
public class Cursos {

    public static void main(String[] args) {
        Curso curso111= new Curso("111", 40);
        Profesor alumno=new Profesor("Joffrey", " Baratheon", 25346123, 2018);
        alumno.addCurso(curso111);
    }
    
}
