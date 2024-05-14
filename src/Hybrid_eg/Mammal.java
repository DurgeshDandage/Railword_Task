package Hybrid_eg;

public class Mammal extends Animal{
    int numberOfLegs;

    // Constructor
    Mammal(String species, int numberOfLegs) {
        super(species); // calling the constructor of the superclass
        this.numberOfLegs = numberOfLegs;
        System.out.println("Mammal constructor called");
    }

    void displayLegs() {
        System.out.println("Number of legs: " + numberOfLegs);
    }
}
