package Hybrid_eg;

public class Animal {
    String species;

    // Constructor
    Animal(String species) {
        this.species = species;
        System.out.println("Animal constructor called");
    }

    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}
