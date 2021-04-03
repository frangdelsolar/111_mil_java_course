/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author frang
 */
public class estaticos {
    
//    public static int [][] matriz = new int [5][5];
//    
//    public static void main(String[] args){
//        int valor = 8;
//        matriz[2][2] = valor;
//        System.out.println("calcular = " + calcular(valor));
//    }
//    
//    public static int calcular(int a){
//        return a + matriz[matriz.length-1][matriz.length-1];
//    }
    
    
/* Se desea que un programa calcule y muestre el factorial de un número ingresado por el usuario
 * Cuando el valor a multiplicar sea par, se debe pasar al método denominado pares, 
        para multiplicarlo al resultado anterior.
 * Cuando el valor sea impar, se debe pasar al método impares, 
        para multiplicar por el resultado anterior.
 * El resultado final estará alojado en una variable estática.
 */
    public static int factorial = 1;
   
    public static void main (String[] args){
        
        int num = 8;
        
        for (int i=num; i>=1; i--){
            if (i%2==0){
                pares(i);
                System.out.println("Par");
            }else{
                impares(i);
                System.out.println("Impar");
            }
        }        
        System.out.println(factorial);        
    }
    
    public static void pares(int num){
        factorial *= num;
    }
    
    public static void impares(int num){
        factorial *= num;
    }
}
