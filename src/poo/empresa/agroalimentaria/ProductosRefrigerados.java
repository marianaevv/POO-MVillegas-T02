/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.empresa.agroalimentaria;

/**
 *
 * @author Mariana Villegas
 */
public class ProductosRefrigerados extends Productos {
    private final String composicion;
    
    public ProductosRefrigerados(String fechacaducidad, int lote, String composicion) {
        super(fechacaducidad, lote);
        this.composicion = composicion;
    }
    public String getComposicion(){
        return this.composicion;
    }
    
}
