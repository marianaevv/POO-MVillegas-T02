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
public class ProductosFrescos extends Productos {
    
    protected final String procedimientoproduccion;
    
    public ProductosFrescos(String fechacaducidad, int lote, String procedimientoproduccion) {
        super(fechacaducidad, lote);
        this.procedimientoproduccion = procedimientoproduccion;
    }
    /**
     * Metodo que sirve para obtener el tipo de procedimiento que se utilizo en la produccion de los alimentos frescos 
     * @return cadena
     */
    public String getProcedimiento () {
            return this.procedimientoproduccion;
}
    
}
