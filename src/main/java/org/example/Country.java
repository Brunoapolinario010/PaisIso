package org.example;

public class Country {
    private String isoCode;
    private String name;
    private int population;
    private double dimensionKm2;
    private Country[] neighbors;

    public Country(String isoCode, String name, double dimensionKm2) {
        this.isoCode = isoCode.toUpperCase();
        this.name = name;
        this.dimensionKm2 = dimensionKm2;
        this.neighbors = new Country[40];
    }

    public String getIsoCode() {
        return this.isoCode;
    }

    public String getName() { return this.name; }

    public void setPopulation(int population) {
        this.population = population;
    }
    public boolean countryExists(Country country) {
        return this.getIsoCode().equals(country.getIsoCode());
    }
    public double getPopulationDensity() {
        return this.population / this.dimensionKm2;
    }
    public boolean isNeighbor(Country country) {
        for (Country neighbor : this.neighbors) {
            if(neighbor != null && neighbor.countryExists(country)) {
                return true;
            }
        }
        return false;
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
