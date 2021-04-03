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
public class claseC extends claseB{
    public int c;

    public claseC() {
    }

    public claseC(int c) {
        this.c = c;
    }

    public claseC(int c, int b) {
        super(b);
        this.c = c;
    }
    
    public claseC (int c, int b, int a){
        super(b, a);
        this.c = c;
    }
    
    @Override
    public int contar(){
        return c*4;
    }
    
    public int contar_de_B (){
        return super.contar();
    }
    
    public int contar_de_a () {
        return super.contar_de_super();
    }
    
    @Override
    public void saludar(){
        System.out.println("Soy C");
    }
    
    public void superSaludo(){
        super.saludar();
    }
    
    public void superSuperSaludo (){
        super.saludar_super();
    }
}
