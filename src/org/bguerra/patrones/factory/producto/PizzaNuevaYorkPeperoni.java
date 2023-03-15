package org.bguerra.patrones.factory.producto;

import org.bguerra.patrones.factory.PizzaProducto;

public class PizzaNuevaYorkPeperoni extends PizzaProducto {
    public PizzaNuevaYorkPeperoni() {
        super();
        nombre = "Pizza Peperoni New York";
        masa = "masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra pepperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 90°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortar la pizza en triangulos");
    }
}
