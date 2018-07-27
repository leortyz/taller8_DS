/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDecorator;

import patronFactoryMethod.*;

/**
 *
 * @author ProyectoDS5
 */
public class Logo extends ComprobanteDecorator {

    public Logo(Comprobante comp){
        super(comp);
    }
    
    @Override
    public String crearComprobante() {
        return getComprobante().crearComprobante()+" con logo";
    }

    @Override
    public String imprimirComprobante() {
        return getComprobante().imprimirComprobante()+" con logo";
    }
    
}
