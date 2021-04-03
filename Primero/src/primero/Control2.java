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
public class Control2 {
    public static void main(String[] args) {
//        int i, k=1, j=0, vector [] = new int[5], matriz [][]=new int[8][9];
//        System.out.println(k);
//        for (i=0; i<matriz.length; i++){
//            for (j=5; j<j+k; j++){
//                vector[i]=j;
//                System.out.println("valor del vector [" + i + "]: - "+ vector[i]);
//            }
//            
//        }
//        
        
        /* 
        Pida al usuario que ingrese una frase respectoa la longitud del string ingresado
        creen un arreglo de tipo char y coloquen allí cada uno de los caracteres que perte_
        necen a la frase. Sólo no se ingresarán en el arreglo los caracteres espacio.
        Al lograrlo mostrará las frases y el arreglo.        
        */
         
        String frase = JOptionPane.showInputDialog("Ingrese frase: ").toLowerCase().trim();
       
        
//        String frase = "Hola mundo! azul, rojo y verde";              
                
        int count = 0;        
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i)!= ' '){
                count += 1;
            }            
        }
        System.out.println(count);
        
        char arreglo[] = new char[count];
        
        count = 0;
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i)!= ' '){
                arreglo[count] = frase.charAt(i);
                count+=1;
            }            
        }
        System.out.println(frase);
        System.out.println(arreglo);
        
    }
    
  
}
