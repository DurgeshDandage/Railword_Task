package Day9.Multilevel;

// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class from Animal
class Mammal extends Animal {
    void breathe() {
        System.out.println("This mammal breathes air.");
    }
}

// Derived class from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog myDog = new Dog();

        // Calling methods from Dog class, Mammal class, and Animal class
        myDog.eat();     // Method from Animal class
        myDog.breathe(); // Method from Mammal class
        myDog.bark();    // Method from Dog class
    }
}
