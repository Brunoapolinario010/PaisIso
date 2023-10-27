package org.example;

public class Country {
    private String isoCode;
    private String name;
    private int population;
    private double dimensionKm2;
    private Country[] neighbors = new Country[40];

    public Country(String isoCode, String name, int population, double dimensionKm2) {
        this.isoCode = isoCode.toUpperCase();
        this.name = name;
        this.population = population;
        this.dimensionKm2 = dimensionKm2;
    }

    public String getIsoCode() {
        return this.isoCode;
    }
    public boolean countryExists(Country country) {
        return this.isoCode.equals(country.getIsoCode());
    }
    public double getPopulationDensity() {
        return this.population / this.dimensionKm2;
    }
    public void getNeighbors() {
        System.out.println("Neighbors of " + this.name + ":");
        for(Country neighbor : this.neighbors) {
            if (neighbor != null) {
                System.out.println(neighbor.getIsoCode());
            }
        }
    }
    public void addNeighbor(Country country) {
        for (int i = 0; i < this.neighbors.length; i++) {
            if (this.neighbors[i] == null) {
                this.neighbors[i] = country;
                break;
            }
        }
    }
}
