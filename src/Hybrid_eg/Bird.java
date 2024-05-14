package Hybrid_eg;

public class Bird extends Animal{
    boolean canFly;

    // Constructor
    Bird(String species, boolean canFly) {
        super(species); // calling the constructor of the superclass
        this.canFly = canFly;
        System.out.println("Bird constructor called");
    }

    void displayFlyingAbility() {
        System.out.println("Can fly: " + canFly);
    }
}
