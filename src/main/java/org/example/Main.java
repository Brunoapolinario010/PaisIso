package org.example;

public class Main {
    public static void main(String[] args) {
        Country c1 = new Country("BRA", "Brazil", 209500000, 8515767);
        Country c2 = new Country("ARG", "Argentina", 44270000, 2780400);
        Country c3 = new Country("PAR", "Paraguay", 7053000, 406752);

        c1.addNeighbor(c2);
        c1.addNeighbor(c3);
        System.out.println(c1.getIsoCode());
        System.out.println(c1.getPopulationDensity());
        c1.getNeighbors();
    }
}