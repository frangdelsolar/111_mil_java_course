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
public class T3E1 {
     public static void main(String[] args) {     
         
         
//        // Ej 1 
//        int num; int resultado;
//        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número: "));
//        
//        for (int i = 1; i <= 10; i++){
//            resultado = num * i;
//            System.out.println(num + " * " + i + " = " + resultado);
//        }



//        // Ej2
//        for (int i = 1; i <= 10; i++){
//            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número: "));
//            if (num % 2 == 0){
//                System.out.println(num);
//            }
//        } 



//        // Ej3
//        int ceros=0; int positivos=0; int negativos=0;
//        
//        for (int i = 1; i <= 10; i++){
//            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número: "));
//            if (num == 0){
//                ceros++;
//            }else{ 
//                if (num > 0){
//                positivos++;
//            } else{
//                    negativos++;
//                }
//            }       
//         }
//        System.out.println("Ceros: " + ceros + ". Positivos: " + positivos + ". Negativos: " + negativos);



//        // Ej 4        
//        int nota=0; int total=0; int promedio=0; int notaBaja = 1000; int notaAlta = 0;
//      
//        int notas = 10;
//        
//        for (int i = 1; i <= notas; i++){
//            nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota: "));
//            total = total + nota;
//            if (nota < notaBaja){
//                notaBaja = nota;
//            }
//            if (nota > notaAlta){
//                notaAlta = nota;
//            }
//            System.out.println(nota);
//        }
//        
//        promedio = total / notas;
//        
//        System.out.println("Promedio: " + promedio + ". Nota más baja: " + notaBaja + ". Nota más alta: " + notaAlta);



//        // Ej 5
//        
//        for (int i = 0; i <= 23; i++){
//            for (int j = 0; j <= 59; j++){
//                for (int k = 0; k <= 59; k++){
//                    System.out.println(i + ":" + j + ":" + k);
//                }
//            }
//            
//        }



//        // Ej 6
//        // Igual a Ej 4. Nota más baja



//        // Ej 7
//        float interes = 0.2f; 
//        float salario;
//        float ganancia = 0;
//        
//        salario = Float.parseFloat(JOptionPane.showInputDialog("Ingrese salario: "));
//        
//        for (int i = 1; i <= 12; i++){
//            ganancia = ganancia + (salario * interes);
//            System.out.println("Mes: " + i + ". Salario: $" + ganancia);
//        }



//           // Ej 8
//
//            float descuento = 0.0f; 
//            float importe = 0;
//            int opcion;
//            
//
//            do{
//                opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Roja \n 2. Amarilla \n 3. Blanca \n 4. Salir"));
//                if (opcion >= 1 && opcion <= 3){
//                    importe = Integer.parseInt(JOptionPane.showInputDialog("Ingrese importe: "));
//                    }  
//                switch(opcion){
//                    case 1:
//                        descuento = 0.4f;
//                        importe = importe - importe*descuento;
//                        System.out.println("40% de descuento aplicado - Total: " + importe);
//                        break;
//
//                    case 2:
//                        descuento = 0.25f;
//                        importe = importe - importe*descuento;
//                        System.out.println("25% de descuento aplicado - Total: " + importe);
//                        break;
//
//                    case 3:
//                        descuento = 0.0f;
//                        importe = importe - importe*descuento;
//                        System.out.println("No hay descuento :'( - Total:" + importe);
//                        break;
//
//                    case 5:
//                        System.exit(0);  
//                }
//                
//            } while(opcion != 4);
 


//            // Ej 9
//            float subtotal = 0; 
//            float total = 0;
//            float importe = 0;
//            int opcion = 0; 
//            int cantidad = 0;
//            
//
//            do{
//                opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar artículo \n 2. Salir"));
//                if (opcion == 1){
//                    importe = Integer.parseInt(JOptionPane.showInputDialog("Ingrese importe: "));
//                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad: "));
//                    }  
//                switch(opcion){
//                    case 1:
//                        subtotal = importe*cantidad;
//                        total = total + subtotal;
//                        System.out.println("Subtotal: " + subtotal);
//                        System.out.println("Total: " + total);
//                        break;
//
//                    case 2:
//                        System.out.println("Total al finalizar compra: " + total);
//                        System.exit(0);  
//                }
//                
//            } while(opcion != 2);
            


//            // Ej 10
//            float descuento=0; float importe=0; float total=0;            
//            int opcion=0; int edad=0; 
//            
//
//            do{
//                opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Consultar ingreso \n 2. Salir"));
//                if (opcion == 1){
//                    importe = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio del asiento: "));
//                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));
//                    }  
//                switch(opcion){
//                    case 1:
//                        if (edad<5){
//                            System.out.println("Niños menores de 5 años no pueden ingresar al teatro");
//                        } 
//                        else if(edad>=5 && edad<=14){
//                            descuento = 0.35f;
//                            total = importe + (importe*descuento);
//                            System.out.println("Descuento aplicado. Total:" + total);
//                            
//                        }
//                        else if(edad>=15 && edad<=19){
//                            descuento = 0.25f;
//                            total = importe + (importe*descuento);
//                            System.out.println("Descuento aplicado. Total:" + total);
//                        }
//                        else if(edad>=20 && edad<=45){
//                            descuento = 0;
//                            total = importe + (importe*descuento);
//                            System.out.println("Descuento aplicado. Total:" + total);
//                        }
//                        else if(edad>=46 && edad<=65){
//                            descuento = 0.25f;
//                            total = importe + (importe*descuento);
//                            System.out.println("Descuento aplicado. Total:" + total);
//                        }
//                        else{
//                            descuento = 0.35f;
//                            total = importe + (importe*descuento);
//                            System.out.println("Descuento aplicado. Total:" + total);
//                        }                                                  
//                        break;
//
//                    case 2:
//                        System.out.println("Total al finalizar compra: " + total);
//                        System.exit(0);  
//                }
//                
//            } while(opcion != 2);
            

            // Ej 11
           
            int opcion; 
            
            do{
                int dips=0; int voto; int favor=0; int contra=0;
                float total=0; float pfavor=0; float pcontra=0;
                opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar diputados \n 2. Salir"));
                if (opcion == 1){
                    dips = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de diputados: "));
                    }  
                switch(opcion){
                    case 1:
                        for (int i=0; i<dips; i++){
                            voto = Integer.parseInt(JOptionPane.showInputDialog("1. A favor \n 2. En contra"));
                            
                            if(voto==1){
                                favor++;
                            }else if(voto==2){
                                contra++;
                            }
                            
                        }
                        pfavor = favor*100 / dips;
                        pcontra = contra*100 / dips;
                        System.out.println("Porcentaje a favor: " + pfavor +"%");
                        System.out.println("Porcentaje en contra: " + pcontra +"%");
                        break;

                    case 2:                     
                        System.exit(0);  
                }
                
            } while(opcion != 2);    
     }
}
