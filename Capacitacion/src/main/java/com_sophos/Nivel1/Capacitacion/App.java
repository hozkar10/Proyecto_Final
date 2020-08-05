package com_sophos.Nivel1.Capacitacion;

import Clase_4.Carro;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Carro objCarro= new Carro();
        objCarro.setCantidadllantas(4);
        objCarro.setColor("Negro");
        objCarro.setMarcacarro("Nissan");
        objCarro.setNumeroOcupantes(5);
        objCarro.setTipoFuenteEnergia("Gasolina");
        
        
        System.out.println("El numero de Llantas es: "+objCarro.getCantidadllantas() );
        System.out.println("El Colors es: "+objCarro.getColor() );
        System.out.println("La marca del carro es: "+objCarro.getMarcacarro() );
        System.out.println("El numero de ocupantes es: "+objCarro.getNumeroOcupantes() );
        System.out.println("El tipo de energia es: "+objCarro.getTipoFuenteEnergia() );
        
    }
}
