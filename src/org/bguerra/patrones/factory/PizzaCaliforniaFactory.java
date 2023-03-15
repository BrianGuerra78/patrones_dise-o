package org.bguerra.patrones.factory;

import org.bguerra.patrones.factory.producto.PizzaCaliforniaPeperoni;
import org.bguerra.patrones.factory.producto.PizzaCaliforniaQueso;
import org.bguerra.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzaCaliforniaFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "queso" -> new PizzaCaliforniaQueso();
            case "peperoni" -> new PizzaCaliforniaPeperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };
    }
}
