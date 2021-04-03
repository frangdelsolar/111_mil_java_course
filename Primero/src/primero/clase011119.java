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
public class clase011119 {
    public static void main(String[] args){
        
//   Hacer un algoritmo que llene una matriz de 5 * 5 y que almacene 
//      la diagonal principal en un vector. Imprimir el vector resultante. 
    

    int dim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dimensión (1 a 10): "));

    int [][] mat = new int [dim][dim];
    int [] ppal = new int [dim];
    int [] invertida = new int [dim];
    
    for (int i=0; i < mat.length; i++){
         for (int j=0; j < mat[0].length; j++){             
             mat[i][j] = (int)(Math.random()*100);
             System.out.print(mat[i][j] + "  ");             
             if(i==j){
                 ppal[i] = mat[i][j];
                }              
            }         
         System.out.println("");        
        }  
    
    int count = dim-1;
    for (int i=0; i < mat.length; i++){
        invertida[i] = mat[i][count];
        count -= 1;
        }    
    
    System.out.println("*********");
    System.out.println("Diagonal principal");
    for (int i=0; i < mat.length; i++){
        System.out.print(ppal[i] + "  ");
        }
    System.out.println("");
   
    
    System.out.println("*********");
    System.out.println("Diagonal inversa");
    for (int i=0; i < mat.length; i++){
        System.out.print(invertida[i] + "  ");
        }
    System.out.println("");
    System.out.println("*********");
     
    for(int i=0; i<ppal.length; i++){
        System.out.println("Suma ["+ i + "]" + (ppal[i]+invertida[i]));
        }
    int dimension = dim -1;
    int op1 = Integer.parseInt(JOptionPane.showInputDialog("Eligir una fila entre 1 y " + dimension));
    
    int op2 = Integer.parseInt(JOptionPane.showInputDialog("Arriba(1) o abajo(0)?"));
    
    int aux1 = op1+1;
    int aux2 = op1-1;
    
    for (int j=0; j < mat[0].length; j++){
        
              
        
        if(op2 == 0){
            
            if (j%2==0){
                System.out.print(mat[op1][j] + "  ");   
                
            } else {
                System.out.print(mat[aux1][j] + "  ");    
            }
             
            
        } else if(op2 == 1){
            
            
            
            if (j%2==0){
                System.out.print(mat[op1][j] + "  ");                
            } else {
                System.out.print(mat[aux2][j] + "  ");    
            }
            
            
          }
            
        }
   
    }
    
}
/*
a. Para nombrar variables hay que declarar el tipo y el nombre debe ser en minúscula.
b. Las sentencias 'for, while, swith, etc' toman un parámetro entre paréntesis y 
    las sentencias entre curly braces. 
c. Se nombran en mayúsculas las clases
d. Sentencias que finalizan en ';' (vii)int a= 0 y (viii)JOP.sID(), ehile si es pie.

Construya un bucle donde se pueda salir del mismo cuando el usuario responda correctamente
a la siguiente pregunta:
"Es usted estudiante (Si/No)?"



*/