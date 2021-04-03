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
public class claseB extends claseA {
    
    public int b;
    
    public claseB (){
        
    }
    
    public claseB(int b) {
        this.b = b;
    }

    public claseB(int b, int a) {
        super(a);
        this.b=b;
    }

    @Override
    public int contar () {
        return b*3;
    }
    
    public int contar_de_super(){
        return super.contar();
    }
    
    public void saludar(){
        System.out.println("Yo soy B");
    }
    
    public void saludar_super(){
        super.saludar();
    }
}
