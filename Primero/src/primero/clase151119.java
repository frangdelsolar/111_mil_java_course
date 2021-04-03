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
public class clase151119 {
    
    public static void main(String[] args) {
        
        String frase = "Los árboles son verdes y los pájaros vuelan por la medianera.";

        
        int cols = 7;
        int rows = contarFilas(frase.length(), cols);

        char [][] tabla = new char [rows][cols];
        
        int count = 0;
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                tabla[i][j] = frase.charAt(count);
                count += 1;                
                if(count == frase.length()){
                    break;
                }             
            }
        }
        char opcion = 't';
        mostrarFrase(tabla, rows, cols, frase, opcion);
        
    }
    
    public static void mostrarFrase (char [][] tabla, int rows, int cols, String frase, char opcion){
        switch (opcion) {
            case 'f':
                System.out.println(frase);
                break;
            case 't':
                int count = 0;
                for (int i=0; i<rows; i++){
                    for (int j=0; j<cols; j++){
                        tabla[i][j] = frase.charAt(count);
                        System.out.print(tabla[i][j] + " ");
                        count += 1;
                        if(count == frase.length()){
                            break;
                        }
                    }
                    System.out.println("");
                }   break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
    
    public static int contarFilas(int longitudFrase, int columnas){
        int filas = 0;
        if (longitudFrase%columnas == 0){
            filas = longitudFrase / columnas;
            
        } else{
            filas = (longitudFrase / columnas) + 1;
        }
        
        return filas;
    }
    

    
}
