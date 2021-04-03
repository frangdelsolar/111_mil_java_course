/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111mil;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author frang
 */
public class Bicicleteria {
    private List<Bicicleta> bicicletas;
    private float ganancias;
    private int cantidadDeVentas;

    
    public Bicicleteria() {
        bicicletas = new ArrayList<Bicicleta>();
        cantidadDeVentas = 0;
        ganancias = 0;
    }
    
    public void addBicicleta(Bicicleta nuevaBici){
        bicicletas.add(nuevaBici);
    }
    
    public void venderBicicleta(Bicicleta bicicleta){
        bicicletas.remove(bicicleta);
        this.cantidadDeVentas++;
        this.ganancias += bicicleta.getPrecio();
    }
    
    public Bicicleta buscarBicicleta(String nroDeSerie){
        Bicicleta bici;
        for (int i=0; i<=this.bicicletas.size(); i++){
            if (this.bicicletas.get(i).getNroDeSerie().equals(nroDeSerie)){
                return this.bicicletas.get(i);
            }
        }        
        return null;
    }
}


//   SELECT  FROM bicicleta INNER JOIN bicicleteria_idBicicleteria WHERE biicicleteria.idBicicleteria=1