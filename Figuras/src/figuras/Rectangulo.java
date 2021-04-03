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
public class Rectangulo extends Figura {
    protected double alto;
    protected double ancho;
    
    public Rectangulo () {
        super();
    }
    
    public Rectangulo(float espesor, double alto, double ancho){
        super(espesor);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Rectangulo(double alto, double ancho, float espesor, int numero) {
        super(espesor, numero);
        this.alto = alto;
        this.ancho = ancho;
    }
    
    @Override
    public double perimetro(){
        return (alto * 2) + (ancho * 2);
    }
    
    @Override
    public double superficie(){
        return alto * ancho;
    }
}
