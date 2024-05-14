package Hybrid_eg;

public class Main {
    public static void main(String[] args) {
        // Creating an object of Mammal class
        Mammal mammal = new Mammal("Canine", 4);
        mammal.displaySpecies(); // inherited from Animal
        mammal.displayLegs();    // from Mammal class

        // Creating an object of Bird class
        Bird bird = new Bird("Parrot", true);
        bird.displaySpecies();       // inherited from Animal
        bird.displayFlyingAbility(); // from Bird class
    }
}
