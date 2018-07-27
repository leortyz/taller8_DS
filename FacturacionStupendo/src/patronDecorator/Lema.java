/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDecorator;

import patronFactoryMethod.Comprobante;

/**
 *
 * @author ProyectoDS5
 */
public class Lema extends ComprobanteDecorator{

    public Lema(Comprobante comp) {
        super(comp);
    }

    @Override
    public String crearComprobante() {
        return getComprobante().crearComprobante()+" con lema";
    }

    @Override
    public String imprimirComprobante() {
        return getComprobante().imprimirComprobante()+" con lema";
    }
    
}
