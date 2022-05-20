package com.open_bootcamp;

public class App {
    public static void main(String[] args) {
        suma(2, 5, 6);

        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        int suma = a + b + c;

        System.out.println(suma);
    }

    static class Coche {
        public int puertas = 0;

        public void sumarPuertas() {
            this.puertas++;
        }
    }
}
