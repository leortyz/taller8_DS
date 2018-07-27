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
public class ConcreteCreator extends Creator{
    @Override
    public Comprobante factoryMethod(CType tipo) {
        switch (tipo){
            case Factura:
                return new Factura();
            case GuiaRemision:
                return new GuiaRemision();
            case NotaCredito:
                return new NotaCredito();
            default:
                throw new IllegalArgumentException("No soportado");
        }
    }   
}
