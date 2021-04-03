/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

import javax.swing.JOptionPane;

/**
 *
 * @author frang
 */

public class clase111119 {
    public static void main(String[] args) {
        
        int valor = esPar(Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor: ")));
        
        if (valor==0){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
        

    }
    public static int esPar(int num){
        return (num % 2);
    }
}
