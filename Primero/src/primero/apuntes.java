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
public class apuntes {
    public static void main(String[] args) {
        
        /*
         *   Declaración de arreglos
         *      int arre[] = new int[10];
         */
        
        
        /*
         *   Generar número aleatorio
         *      Math.random()
         *   Esta función genera un número de doble precisión entre 0 y 1
         */

        
//        int arre[] = new int[10];
//        
//        for (int i=0; i<arre.length; i++){
//            arre[i] =(int)(Math.random()*100);        
//            System.out.println("Pos["+i+"]"+ arre[i]);
//        }


//        char arre[] = new char[26];
//        
//            for (int i=0; i<arre.length; i++){
//                arre[i] = (char)(i+65);
//                System.out.println("Cod[" + (i+65) + "] = " + arre[i]);
//            }

        /* 
         *   Ejercicio:
         *   Calcular el promedio de 10 valores almacenados en un vector
         */
 
         
//        int arre[] = new int[10];
//        float total=0;
//        float prom=0;
//        
//        
//        for (int i=0; i<arre.length; i++){
//            arre[i] =(int)(Math.random()*100);
//            // System.out.println(arre[i]);
//            total+=arre[i];
//            
//        }
//        
//        prom= (float)total/ (float)arre.length;
//        System.out.println("Total = " + total);
//        System.out.println("Promedio = " + prom);  

        /* 
         *   Ejercicio:
         *   Determinar, con el vector anterior, cuántas notas son mayores que el promedio.
         *   Mostrar el promedio, el número de mayores y una lista de esos valores
         *   CONTINUACIÓN DEL EJERCICIO ANTERIOR
         */
        
//        int mayores=0;
//        
//        for (int i=0; i<arre.length; i++){
//            if (arre[i] > prom){
//                mayores++;
//                System.out.println(arre[i]);
//            } 
//        }
//        
//        System.out.println("Cantidad de mayores que el promedio: " + mayores);

        /*
         * Métodos para cadena de texto
         */
        
        String frase = JOptionPane.showInputDialog("Ingrese una frase").trim();
        
        System.out.println(frase.length());
        
//        int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entre 0 y " + (frase.length()-1)));
//        System.out.println("En la posicion " + pos + " está el caracter: " + frase.charAt(pos));
//        System.out.println("Desde " + pos + " se encuentra '" + frase.substring(pos) + "'.");
        System.out.println("Subcadena '" + frase.substring(4, 8)+ "'.");
        
        /*
         * Contar la cantidad de "a" en la frase
        */
        int letrasA=0;
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i)=='a'){
                letrasA++;            
            }
        }
        System.out.println("Cantidad de a:" + letrasA);
        
        /*
         * Convertir a mayúscula sólo la primeras letras de cada palabra
        */
        
        frase = frase.valueOf(frase.charAt(0)).toUpperCase() + frase.substring(1); 
        
        System.out.println(frase);
        for (int i=1; i<frase.length(); i++){
            if (frase.charAt(i)==' '){
                 frase = frase.substring(0, i+1) + frase.valueOf(frase.charAt(i+1)).toUpperCase() + frase.substring(i+2);          
            }
        }
        System.out.println(frase);
       
        /*
         * Contar la cantidad de palabras
        */
        int cantPalabras=1;
        for (int i=1; i<frase.length(); i++){
            if (frase.charAt(i)==' '){
                  cantPalabras++;         
            }
        }
        System.out.println("Cantidad de palabras: " + cantPalabras);
        
        
    }
}
