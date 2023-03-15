package org.bguerra.patrones.factory.producto;

import org.bguerra.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPeperoni extends PizzaProducto {
    public PizzaCaliforniaPeperoni() {
        super();
        nombre = "Pizza California Pepperoni";
        masa = "Masa a la piedra gruesa";
        ingredientes.add("Pepperoni");
        ingredientes.add("Extra queso mozzarella");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 50 min. a 55°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectangulos");
    }
}
