package org.bguerra.patrones.observer.ejemplos;

import org.bguerra.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver((observable, obj) -> {
            System.out.println("John: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Brian: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Brenda: " + observable);
        });

        google.modificaPrecio(2000);
    }
}
