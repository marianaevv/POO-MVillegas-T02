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
public class ProductosCongelados extends Productos {
    //Productos Congelados  
    private final double tempcong;
    /**
     * Constructor
     * @param fechacaducidad
     * @param lote
     * @param tempcong 
     */
    public ProductosCongelados(String fechacaducidad, int lote, double tempcong) {
        super(fechacaducidad, lote);
        this.tempcong = tempcong;
           
    }
    /**
     * Metodo que devuelve la temperatura de congelamiento 
     * @return double
     */
    public double getTemp (){
        return this.tempcong;
        }
    
}
