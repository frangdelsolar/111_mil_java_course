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
public class SiNo {
    public static void main(String[] args){
        
/*        
   Construya un bucle donde se pueda salir del mismo cuando el usuario responda 
        correctamente a la siguiente pregunta:
"Es usted estudiante (Si/No)?"

*/   
        int cuad =0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        cuad = calcularCuadrado(num);
        System.out.println(cuad);

        
      
        
    }
    
    public static int calcularCuadrado(int numero){
        return numero*numero;
    }
    
}
