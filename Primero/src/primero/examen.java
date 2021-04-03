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
public class examen {
    public static void main(String[] args) {
        String [] productos = new String [4];
        int [] ventas = new int [4];
        int [] precios = new int [4];

        productos = ["varillas de acero", "tuercas", "lijas", "flexibles"];
        ventas = [100, 200, 50, 40];
        precios = [1500, 40, 180, 600];

        int ingresoMensual = calcIngresoMensual(ventas, precios); 


        int porcentaje = 80; // El valor del porcentaje puede ser cualquiera de los indicados en la consigna 2) u otro		
        float porcentajeVentas = calcIng(ingresoMensual, porcentaje);

        int dias = 30; // La cantidad de días puede ser cualquiera de las indicadas en la consigna 3 u otra
        float porcStock = calcStock(productos, ventas, porcentaje, dias);
    }
    
    public static float calcIngresoMensual(int [] cantidad, int [] precio){
		int total = 0;
		for (int i=0; i<cantidad.length; i++){
			total += cantidad[i] * precio[i];
		}
		return total;	
    }
	
	public static float calcIng(int ingreso, int porcentaje){
		return (porcentaje*ingreso/100.0f);	
	}

	public static void calcStock(String [] productos, int [] ventas; int porcentaje, int dias){
		System.out.println("Para cubrir ventas del " + porcentaje + "% por " + dias + " se necesitará el siguiente stock." );		
		for (int i=0; i<productos.length; i++){
			float total = (porcentaje * ventas[i] / 100) * dias/30;			
			System.out.println("Producto: " + productos[i] + total );
		}
	
	}
    
}
