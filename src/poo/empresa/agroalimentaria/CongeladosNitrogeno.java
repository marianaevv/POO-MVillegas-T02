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
    
    public CongeladosNitrogeno(String fechacaducidad, int lote, double tempcong, String tipocongelacion) {
        super(fechacaducidad, lote, tempcong);
        this.tipocongelacion = tipocongelacion;
    }
    
    public String getTipoCongelacion (){
        return this.tipocongelacion;
    }
    
}
