/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socios;

/**
 *
 * @author frang
 */
public class A {
    public String codigo;
    public int valor;
    public B rol1;
    public C rol2;

    
    public A (){
        
    }
    
    public A (String codigo, int valor, B rol1, C rol2){
        this.codigo = codigo;
        this.valor = valor;
        this.rol1 = rol1;
        this.rol2 = rol2;
    }


    
    public void mostrarAtributos(){
        System.out.println("##############");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Valor: " + this.valor);
        if (this.rol1 != null){
            System.out.println("Rol: " + this.rol1.nombre);
        }
        if (this.rol2 != null){
            System.out.println("Rol: " + this.rol2.nombre);
        }
        System.out.println("##############");
    }
    
    public int sumar(){
        int total;
        total = this.valor + this.rol1.edad + this.rol2.edad;               
        return total;
    }
    


}
