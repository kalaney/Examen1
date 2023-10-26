/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import javax.swing.JOptionPane;

/**
 *
 * @author Kalaney
 */
public class Deudor {
    //Atributos del deudor
    public String nombreCliente;
    public String idCliente;
    public String numeroFactura;
    public String montoFactura;
    public String mesFactura;
    public String añoFactura;
    public String estadoFacturas;
    
//Constructores

    public Deudor(String nombreCliente, String idCliente, String numeroFactura, String montoFactura, String mesFactura, String añoFactura, String estadoFacturas) {
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.numeroFactura = numeroFactura;
        this.montoFactura = montoFactura;
        this.mesFactura = mesFactura;
        this.añoFactura = añoFactura;
        this.estadoFacturas = estadoFacturas;
    
     
//INFORMACION DEL USUARIO
    

    }

    public String getNombreCliente() {
        nombreCliente=JOptionPane.showInputDialog("Ingrse su nombre: ");
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getIdCliente() {
        idCliente=JOptionPane.showInputDialog("Ingrese su cedula: ");
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNumeroFactura() {
        numeroFactura=JOptionPane.showInputDialog("Ingrese el numero de Factura:  ");
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getMontoFactura() {
        montoFactura=JOptionPane.showInputDialog("Ingrese el monto de la Factura: ");
        return montoFactura;
    }

    public void setMontoFactura(String montoFactura) {
        this.montoFactura = montoFactura;
    }

    public String getMesFactura() {
        mesFactura=JOptionPane.showInputDialog("Ingrese el mes de la Factura: ");
        return mesFactura;
    }

    public void setMesFactura(String mesFactura) {
        this.mesFactura = mesFactura;
    }

    public String getAñoFactura() {
        añoFactura=JOptionPane.showInputDialog("Ingrese el año de la Factura: ");
        return añoFactura;
    }

    public void setAñoFactura(String añoFactura) {
        this.añoFactura = añoFactura;
    }

    public String getEstadoFacturas() {
        estadoFacturas=JOptionPane.showInputDialog("Ingrese 1 para registrar facturas pagadas, o Ingrese 2 para facturas no pagadas");
      
        return estadoFacturas;
    }

    public void setEstadoFacturas(String estadoFacturas) {
        this.estadoFacturas = estadoFacturas;
    }
}
