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
    protected final String composicion;
    /**
     * 
     * @param fechacaducidad
     * @param lote
     * @param composicion 
     */
    //constructor
    public ProductosRefrigerados(String fechacaducidad, int lote, String composicion) {
        super(fechacaducidad, lote);
        this.composicion = composicion;
    }
    /**
     * Metodo que devuelve la composicion de la atmosfera en la que se refrigeraran los productos ya sea CO2 en aumento o CO2 disminuyendo
     * @return cadena
     */
    public String getComposicion(){
        return this.composicion;
    }
    
}
