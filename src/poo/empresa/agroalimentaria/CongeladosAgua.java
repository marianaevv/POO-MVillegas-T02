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
public class CongeladosAgua extends ProductosCongelados {
    private final double liquidoproducto;
    /**
     * 
     * @param fechacaducidad
     * @param lote
     * @param tempcong
     * @param liquidoproducto 
     */
    public CongeladosAgua(String fechacaducidad, int lote, double tempcong, double liquidoproducto) {
        super(fechacaducidad, lote, tempcong);
        this.liquidoproducto = liquidoproducto;
    }
    /**
     * Metodo que devuelve la cantidad de liquido que tiene la fruta que se congelara ya que de ese liquido dependera la temperatura de congelamiento
     * @return interger
     */
    public double getCantidadliquido (){
        return this.liquidoproducto;
    }
}
