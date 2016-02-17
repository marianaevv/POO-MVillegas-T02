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
public class CongeladosAire extends ProductosCongelados {
    private final String equipo;
    public CongeladosAire(String fechacaducidad, int lote, double tempcong, String equipo) {
        super(fechacaducidad, lote, tempcong);  
        this.equipo = equipo;
    }
    public String getEquipoCongelacion (){
        return this.equipo;
    }
    
}
