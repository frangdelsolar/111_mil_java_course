package primero;

import javax.swing.JOptionPane;

public class Metodo {
    public static void main(String[] args) {        
//        String frase = JOptionPane.showInputDialog("Ingrese frase: ").toLowerCase().trim();
//        String frase = "Hola tarolas";
//        System.out.println("Cantidad de caracteres: " + cuentaCaracteres(frase));  
//        
//        System.out.println(raizCubica(888));

        double altura = 1.65;
        double peso = 67;
        System.out.println("IMC: " + calcIMC(peso, altura));
    }
    
        public static double calcIMC(double peso, double altura){
        return (peso/(Math.pow(altura, 2)));
    }
    
//    public static int cuentaCaracteres(String cadena){
//        int cuentaCars = 0;           
//        for (int i=0; i<cadena.length(); i++){
//            if (cadena.charAt(i)!= ' '){
//                cuentaCars += 1;
//            }            
//        }        
//        return cuentaCars;    
//    }
//    
//    public static double raizCubica(double num){        
//        double resultado = Math.pow(num, (1.0/3.0)); 
//        return resultado;
//    }
        
       /*
        Pedir al usuario un frase. Guardar los caracteres e matrix que solo tiene 
        3 columnas. Hay que calcular la cantidad de filas.
        
        frase = "Hoy es lunes"
        */
    

}
