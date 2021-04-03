/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.logging.Logger;

/**
 *
 * @author frang
 */

public class Persona {
    
    private int dni;
    public String nombre;
    protected int edad;

    public String estudios_cursados;
    
    private int milanesa;

    public int getMilanesa() {
        return milanesa;
    }

    public void setMilanesa(int milanesa) {
        this.milanesa = milanesa;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Persona(){}
    
    public Persona(int dni){
        this.dni = dni;
    }
    
    public Persona(int dni, String nombre, int edad, String est_curs){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        estudios_cursados = est_curs; //this es solo necesario cuando el nombre de la variable es igual al argumento
    }
    
    public void show(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estudios: " + estudios_cursados);
        System.out.println("DNI: " + getDni());
        System.out.println("");
    }
    
    public void sumar(Persona per){
        System.out.println(this.edad + per.edad);
    }
    
    public int getDni(){ //obtener el valor DNI
        return dni;
    }
    
    public void setDni(int num){ //establecer el valor DNI
        dni=num;        
    }
    
}
