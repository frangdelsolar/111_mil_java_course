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
public class Circulo extends Figura {
    private final double PI=3.14;
    protected double radio;

    public Circulo() {}

    public Circulo(double radio, float espesor) {
        super(espesor);
        this.radio = radio;
    }
    
    
    
    @Override
    public double superficie(){
        return PI* Math.pow(radio, 2);
    }
    
    @Override
    public double perimetro(){
        return PI * radio;
    }
}
