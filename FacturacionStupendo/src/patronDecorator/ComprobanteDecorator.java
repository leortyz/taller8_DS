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
public abstract class ComprobanteDecorator implements Comprobante{
    private Comprobante comp;
    
    public ComprobanteDecorator(Comprobante comp){
        this.comp=comp;
    }
    
    public Comprobante getComprobante(){
        return this.comp;
    }
    
    public void setComprobante(Comprobante comp){
        this.comp=comp;
    }
}
