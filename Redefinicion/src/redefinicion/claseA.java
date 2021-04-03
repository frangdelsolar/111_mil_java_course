/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redefinicion;

/**
 *
 * @author frang
 */
public class claseA {
    
    public int a;
    
    public claseA () {
        
    }
    
    public claseA(int a) {
        this.a = a;
    }
    
    public int contar(){
        return a*2;
    }
    
    public void saludar () {
        System.out.println("Hola! Soy A");
    }
    
    
}
