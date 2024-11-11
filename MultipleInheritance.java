// Main class to demonstrate multiple inheritance using interfaces
public class MultipleInheritance {
    public static void main(String[] args) {
        // Create a Bear object, which inherits behaviors from both Herbivore and Carnivore interfaces
        Bear bear = new Bear();
        bear.eatPlants();     // Calls the method from Herbivore interface
        bear.eatMeat();       // Calls the method from Carnivore interface
    }
}

// Interface Herbivore: defines behavior for animals that eat plants
interface Herbivore {
    // Abstract method that any herbivore must implement
    void eatPlants();
}

// Interface Carnivore: defines behavior for animals that eat meat
interface Carnivore {
    // Abstract method that any carnivore must implement
    void eatMeat();
}

// Bear class implements both Herbivore and Carnivore interfaces
// This way, Bear inherits behaviors from both interfaces, achieving multiple inheritance
class Bear implements Herbivore, Carnivore {
    // Implementation of the eatPlants method from Herbivore
    public void eatPlants() {
        System.out.println("Bear eats plants.");
    }

    // Implementation of the eatMeat method from Carnivore
    public void eatMeat() {
        System.out.println("Bear eats meat.");
    }
}
