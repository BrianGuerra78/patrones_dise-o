package org.bguerra.patrones.decorator;

import org.bguerra.patrones.decorator.decorador.MayusculasDecorador;
import org.bguerra.patrones.decorator.decorador.ReversaDecorador;
import org.bguerra.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Brian!");

        MayusculasDecorador mayuscula = new MayusculasDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);

        System.out.println(subrayar.darFormato());
    }
}
