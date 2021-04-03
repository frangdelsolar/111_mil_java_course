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
public class Ej4 {
     public static void main(String[] args) {
         
/**      4. Muestre en pantalla 5 opciones: 1-sumar, 2-restar, 3-multiplicar, 4-dividir, 5-salir.
 *       Indique al operador que debe elegir una de las opciones. Luego, pida que ingrese 2 números 
 *       con los cuales se realizará la operación elegida.
 *       Tenga cuidado en el caso de que haya elegido 4, ya que si el usuario 
 *       ingresa el 0 (cero) como número divisor, se producirá un error, 
 *       entonces debe avisar que ese cálculo no se puede realizar.
 */

        int opcion; int num1=0; int num2=0; int resultado=0;

        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir"));
            if (opcion >= 1 && opcion <= 4){
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número: "));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número: "));
            }
            
            switch(opcion){
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Suma: " + resultado);
                    break;
                
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resta: " + resultado);
                    break;
                
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Multiplicación: " + resultado);
                    break;
                
                case 4:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "No es posible dividir por 0");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("División: " + resultado);
                    }
                    break;
                
                case 5:
                    System.exit(0);                
            }            
        } while(opcion != 5);
     }
}
