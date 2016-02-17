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
       protected final String equipo;
    /**
     * 
     * @param fechacaducidad
     * @param lote
     * @param tempcong
     * @param equipo 
     */
    public CongeladosAire(String fechacaducidad, int lote, double tempcong, String equipo) {
        super(fechacaducidad, lote, tempcong);  
        this.equipo = equipo;
    }
    /**
     * Metodo que devuelve el equipo que se utilizara para congelar por aire
     * @return cadena
     */
    public String getEquipoCongelacion (){
        return this.equipo;
    }
    
}
