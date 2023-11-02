package org.example;

public class Main {
    public static void main(String[] args) {
        Country c1 = new Country("BRA", "Brazil", 8515767);
        Country c2 = new Country("ARG", "Argentina", 2780400);
        Country c3 = new Country("PAR", "Paraguay", 406752);
        Country c4 = new Country("FRA", "France", 591675);

        c1.addNeighbor(c2);
        c1.addNeighbor(c3);
        c1.setPopulation(220000000);
        System.out.println(c1.getIsoCode());
        System.out.println(c1.getName());
        System.out.println(c1.getPopulationDensity());
        System.out.println("Faz fronteira com: " + c2.getName() + " " + c1.isNeighbor(c2));
        System.out.println("Faz fronteira com: " + c4.getName() + " " + c1.isNeighbor(c4));
    }
}