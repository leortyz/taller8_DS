/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronFactoryMethod;

/**
 *
 * @author ProyectoDS5
 */
public class NotaCredito implements Comprobante{
    private String detallesEmisor;    
    private String numAutorizacion;
    private String claveAcceso;
    private String nombreCliente;
    private String codigoComprobanteModificar;
    private String fecha;
    private String detalleModificacion;
    private float valorPagar;

    @Override
    public String crearComprobante() {
        return "Creando nota de credito ...";
    }

    @Override
    public String imprimirComprobante() {
        return "Imprimiendo nota de credito ...";
    }
}
