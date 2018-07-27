/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronFactoryMethod;

import java.util.ArrayList;

/**
 *
 * @author ProyectoDS5
 */
public class Factura implements Comprobante {
    private String detallesEmisor;
    private String nombreCliente;
    private String numAutorizacion;
    private String claveAcceso;
    private String codigo;
    private String fecha;
    private ArrayList<String> listaProductos;
    private float total;

    @Override
    public String crearComprobante() {        
        return "Creando factura ...";
    }

    @Override
    public String imprimirComprobante() {
        return "Imprimiendo factura ...";
    }
    
    
}
