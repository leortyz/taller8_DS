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
public class GuiaRemision implements Comprobante{
    private String detallesEmisor;    
    private String numAutorizacion;
    private String claveAcceso;   
    private String fecha;
    private String destino;
    private String placaVehiculo;
    private ArrayList<String> listaProductos;
    
    @Override
    public String crearComprobante() {
        return "Creando guia de remision ...";
    }

    @Override
    public String imprimirComprobante() {
        return "Imprimiendo guia de remision ...";
    }
}
