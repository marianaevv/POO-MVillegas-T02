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
public class CongeladosNitrogeno extends ProductosCongelados {
    private final String tipocongelacion;
    /**
     * 
     * @param fechacaducidad
     * @param lote
     * @param tempcong
     * @param tipocongelacion 
     */
    public CongeladosNitrogeno(String fechacaducidad, int lote, double tempcong, String tipocongelacion) {
        super(fechacaducidad, lote, tempcong);
        this.tipocongelacion = tipocongelacion;
    }
    /**
     * Metodo que devuelve el tipo de congelacion ya sea IQF (Individual quick freezer) o mediante congelacion lenta
     * @return cadena
     */
    public String getMetodoCongelacion (){
        return this.tipocongelacion;
    }
    
}
