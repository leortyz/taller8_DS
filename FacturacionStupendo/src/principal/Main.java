/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import patronFactoryMethod.*;
import patronDecorator.*;
import patronStrategy.FactruraOnline;
import patronStrategy.FacturacionElectronica;

/**
 *
 * @author ProyectoDS5
 */
public class Main {
    public static void main(String[] args) {
        Comprobante comp = new ConcreteCreator().factoryMethod(CType.NotaCredito);
        System.out.println(comp.crearComprobante());
        System.out.println(comp.imprimirComprobante());
        
        comp=new Logo(comp);
        comp=new Lema(comp);
        
        System.out.println(comp.crearComprobante());
        System.out.println(comp.imprimirComprobante());
        
        FacturacionElectronica facturacion= new FacturacionElectronica(new FactruraOnline());
        Factura factura= facturacion.facturacion();
                
    }
}
