/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronStrategy;

import patronFactoryMethod.Factura;

/**
 *
 * @author ProyectoDS5
 */
public class FactruraOnline implements FacturacionStrategy{

    public FactruraOnline() {
    }
    
    @Override
    public Factura generaFacturacionElectronica() {
        Factura fact = new Factura();
        System.out.println("generando factura online . . .");
        return fact;
    }
    
}
