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
public class Productos {
    //Atributos
    protected String fechacaducidad;
    protected int lote;
    /**
     * 
     * @param fechacaducidad Es la fecha de caducidad del producto
     * @param lote Es el lote del producto
     */
  //Constructor
    public Productos(String fechacaducidad, int lote){
        this.fechacaducidad = fechacaducidad;
        this.lote = lote;
    }
    public String getFecha (){
        return this.fechacaducidad;
     }
    public int getLote (){
        return this.lote;
    }
    
}
