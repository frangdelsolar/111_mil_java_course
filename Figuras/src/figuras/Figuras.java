/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author frang
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        
        Rectangulo rect1 = new Rectangulo(3,5,7);
        System.out.println("Rectángulo");
        System.out.println("Perímetro " + rect1.perimetro());
        System.out.println("Superficie " + rect1.superficie());
        System.out.println("Costo $" + rect1.costo());
        
        
        Circulo circ1 = new Circulo(4, 5);
        System.out.println("Círculo");
        System.out.println("Perímetro " + circ1.perimetro());
        System.out.println("Superficie " + circ1.superficie());
        System.out.println("Costo $" + circ1.costo());


        
        Rectangulo rect2 = new Rectangulo(3,5,7, 100);
        System.out.println("Rectángulo");
        System.out.println("Perímetro " + rect2.perimetro());
        System.out.println("Superficie " + rect2.superficie());
        System.out.println("Costo $" + rect2.costo());
        System.out.println("Numero " + rect2.getNumero());
        
        rect1.setNumero(25);
        System.out.println(rect1.getNumero());
    }
    
}
