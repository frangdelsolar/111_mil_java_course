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
public class clase281019 {
    
    public static void main(String[] args) {
        
        /* 
         *  Ejercicio 5
         */
        
//        String [] arreglo = new String [5];
//        
//        String frase = "Las flores están creciendo mucho";
////        String frase = JOptionPane.showInputDialog("Ingrese frase: ").trim();
//        
//        int indice = 0;
//
//        for (int i=0; i<frase.length(); i++){
//            
//            if (i==0){
//                arreglo[indice] = frase.valueOf(frase.charAt(i)); 
//            } else {
//            
//                arreglo[indice] += frase.valueOf(frase.charAt(i));                   
//                if (frase.charAt(i)==' '){
//                      indice++;   
//                }
//            }
//        }
//        
//        for (int i=0; i<=indice; i++){
//            System.out.println(arreglo[i]);
//        }
        

/*
1)	Calcular el promedio de 10 valores almacenados en un vector. 
2)	Determinar con el vector anterior, cuántos son mayores que el promedio; mostrar el promedio, el número de datos mayores que el promedio y una lista de valores mayores que el promedio.
3)	Almacenar 15 números en un vector, almacenarlos en otro vector en orden inverso al vector original y mostrar en pantalla, ambos. 
4)	Se tienen almacenados en la memoria dos vectores M y N de 20 elementos cada uno. Hacer un algoritmo que escriba la palabra “Iguales” si ambos vectores son iguales y “Diferentes” si no lo son. Aclaración: Serán iguales cuando en la misma posición de ambos vectores se tenga el mismo valor para todos los elementos. 

*/
        // Ejercicio 1
//        int num [] = new int[10];
//        
//        for (int i=0; i>num.length; i++){
//            num[i] = 0;
//        }
        
        // Ej 3
//        int num [] = new int[15];
//        int inv [] = new int[15];
//        
//        for (int j=0; j < num.length; j++){
//            num[j] = (int)(Math.random()*100);
//        }
//        
//        for (int k=0; k<num.length; k++){
//            System.out.print(num[k] + " ");
//        }
//             
//        int j = 0;
//        for (int i=num.length-1; i>=0; i--){            
//            inv[j] = num[i];
//            j++;
//        }
//        
//        System.out.println();
//        
//        for (int k=0; k<inv.length; k++){           
//            System.out.print(inv[k] + " ");
//        }

// Ej 3
        int num [] = new int[15];
        int diff [] = new int[15];
        int eqs [] = new int[15];
        
        for (int j=0; j < num.length; j++){
            num[j] = (int)(Math.random()*100);
            diff[j] = (int)(Math.random()*100);
            eqs[j] = num[j];
        }
        
        for (int k=0; k<num.length; k++){
            System.out.print(num[k] + " ");
        }
             
        int j = 0;
        int k = 0;
        
        for (int i=num.length-1; i>=0; i--){
            if (num[i] == diff[i]){
                j++;
            }
            if (num[i] == eqs[i]){
                k++;
            }            
        }
        System.out.println();
        System.out.println("Lista 1");
        
        for (int x=0; x<diff.length; x++){
            System.out.print(diff[x] + " ");
        }
        
        if (j==num.length){           
            System.out.print("iguales");
        }else {
            System.out.print("no iguales");
        }
        
        System.out.println();
        System.out.println("Lista 2");
        
        for (int x=0; x<eqs.length; x++){
            System.out.print(eqs[x] + " ");
        }
        
        if (k==num.length){           
            System.out.print("iguales");
        }else {
            System.out.print("no iguales");
        }
    }
    
}
