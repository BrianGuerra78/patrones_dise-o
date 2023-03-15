package org.bguerra.patrones.decorator.decorador;

import org.bguerra.patrones.decorator.Formateable;

public class RempazarEspacioDecorador extends TextoDecorador {
    public RempazarEspacioDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
