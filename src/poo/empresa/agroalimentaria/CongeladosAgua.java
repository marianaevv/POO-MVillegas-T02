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
    public CongeladosAgua(String fechacaducidad, int lote, double tempcong, double liquidoproducto) {
        super(fechacaducidad, lote, tempcong);
        this.liquidoproducto = liquidoproducto;
    }
    public double getCantidadliquido (){
        return this.liquidoproducto;
    }
}
