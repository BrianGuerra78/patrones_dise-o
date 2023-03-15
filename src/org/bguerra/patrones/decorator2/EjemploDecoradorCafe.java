package org.bguerra.patrones.decorator2;

import org.bguerra.patrones.decorator2.decorador.ConChocolateDecorador;
import org.bguerra.patrones.decorator2.decorador.ConCremaDecorador;
import org.bguerra.patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe("Cafe Mocha", 7);
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe moca es : " + conChoco.getPrecioBase());
        System.out.println("Los Ingredientes: " + conChoco.getIngredientes());

        Configurable capuchino = new Cafe("Cafe Capuchino", 4);
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del capuchino es: " + conLeche.getPrecioBase());
        System.out.println("Los Ingredientes " + conLeche.getIngredientes());

        Configurable espreso = new Cafe("Cafe Espresso", 3);
        System.out.println("El precio del cafe Espreso es " + espreso.getPrecioBase());
        System.out.println("Los ingredientes del cafe espreso es: " + espreso.getIngredientes());
    }
}
