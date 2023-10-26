/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

import javax.swing.JOptionPane;

/**
 *
 * @author Kalaney
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Deudor d01= new Deudor("", "", "", "", "", "", "");
        
        
        /*
        System.out.println("Nombre: "+d01.getNombreCliente());
        System.out.println("Cedula: "+d01.getIdCliente());
        System.out.println("Numero de Factura: "+d01.getNumeroFactura());
        System.out.println("Monto de la Factura: "+d01.getMontoFactura());
        System.out.println("Mes de la factura: "+d01.getMesFactura());
        System.out.println("Año de la factura: "+d01.getAñoFactura());
        System.out.println("Estado de la factura: "+d01.getEstadoFacturas());
*/       
        String Estado= d01.getEstadoFacturas();
        System.out.println("Estado de la factura: "+Estado);
        int cantidadFacturas= Integer.parseInt(Estado);
        
       
        if(cantidadFacturas==1){
            System.out.println("Numero de Factura: "+d01.getNumeroFactura());
            System.out.println("Monto de la Factura: "+d01.getMontoFactura());
        
            
        }
        else{
            if (cantidadFacturas==2){
                System.out.println("Numero de Factura: "+d01.getNumeroFactura());
                System.out.println("Monto de la Factura: "+d01.getMontoFactura());
            }
            
            
            
        }
        
        
    
        
    
        
    
    }
    
}
