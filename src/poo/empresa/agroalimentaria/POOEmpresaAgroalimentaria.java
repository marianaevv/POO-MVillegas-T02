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
public class POOEmpresaAgroalimentaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProductosCongelados frutas = new ProductosCongelados("12 de julio del 2016",540,-5);
        CongeladosAire fresas = new CongeladosAire ("12 de julio del 2016",540,-5,"Estatico");
        CongeladosAgua moras = new CongeladosAgua ("12 de julio del 2016",540,-5,1.3);
        CongeladosNitrogeno zarzamora = new CongeladosNitrogeno ("12 de julio del 2016",540,-5,"IQF");
       ProductosFrescos verduras = new ProductosFrescos ("16 de julio del 2016",580,"Fertilizacion");
        ProductosRefrigerados hortalizas = new ProductosRefrigerados ("20 de julio del 2016",590, "+CO2");
        
        System.out.println("Esta es la informacion de los articulos congelados");
        System.out.println("Fecha de caducidad: " + frutas.getFecha());
        System.out.println ("Numero de lote: "+ frutas.getLote());
        System.out.println("Temperatura: "+ frutas.getTemp() + " grados");
        
        
        System.out.println("El equipo utilizado para congelar por aire es: "+ fresas.getEquipoCongelacion());
        System.out.println("La cantidad de liquido dentro del fruto es: " +moras.getCantidadliquido() + "ml" );
        System.out.println("El tipo de congelacion por nitrogeno que se utilizará es; " + zarzamora.getTipoCongelacion());
        
        
        System.out.println("Esta es la informacion de los articulos frescos");
        System.out.println("Fecha de caducidad: " + verduras.getFecha());
        System.out.println ("Numero de lote: " + verduras.getLote());
        System.out.println("Esta es el tipo de produccion: " + verduras.getProcedimiento());
        
         System.out.println("Esta es la informacion de los articulos refrigerados");
        System.out.println("Fecha de caducidad: " + hortalizas.getFecha());
        System.out.println ("Numero de lote: "+ hortalizas.getLote());
        System.out.println("Tipo de composicion: " + hortalizas.getComposicion());

    }
    
}
