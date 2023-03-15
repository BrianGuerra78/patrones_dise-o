package org.bguerra.patrones.factory;

import org.bguerra.patrones.factory.producto.PizzaNewYorkItaliana;
import org.bguerra.patrones.factory.producto.PizzaNewYorkVegetariana;
import org.bguerra.patrones.factory.producto.PizzaNuevaYorkPeperoni;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {

        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "peperoni" -> new PizzaNuevaYorkPeperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
