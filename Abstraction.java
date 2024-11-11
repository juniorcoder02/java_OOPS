// Main class to demonstrate abstraction
public class Abstraction {
    public static void main(String[] args) {
        // Creating a Horse object, which is a specific type of Animal
        Horse h1 = new Horse();
        h1.eat();          // Calls the inherited eat method from Animal
        h1.walk();         // Calls the overridden walk method from Horse
        h1.changeColor();  // Specific method for Horse to change its color

        // Creating a Chicken object, which is a different type of Animal
        Chicken c1 = new Chicken();
        c1.eat();          // Calls the inherited eat method from Animal
        c1.walk();         // Calls the overridden walk method from Chicken

        // Uncommenting the following line would cause an error
        // because we cannot instantiate an abstract class directly.
        // Animal a1 = new Animal();

        // Creating a Mustang object, which is a subclass of Horse
        Mustang m1 = new Mustang();
    }
}

// Abstract class Animal: serves as a general template for all animals
abstract class Animal {
    String color;

    // Constructor for Animal class
    Animal() {
        System.out.println("Animal constructor called");
    }

    // Concrete method: common functionality shared by all animals
    void eat() {
        System.out.println("Animal can eat");
    }

    // Abstract method: must be implemented by each subclass
    abstract void walk();
}

// Horse class inherits from Animal and provides its own implementation for walk
class Horse extends Animal {
    // Constructor for Horse class
    Horse() {
        System.out.println("Horse constructor called");
    }

    // Specific method for Horse to change its color
    void changeColor() {
        color = "black";
    }

    // Implementation of the abstract walk method for Horse
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

// Mustang class inherits from Horse; it represents a specific type of Horse
class Mustang extends Horse {
    // Constructor for Mustang class
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

// Chicken class inherits from Animal and provides its own implementation for walk
class Chicken extends Animal {
    // Specific method for Chicken to change its color
    void changeColor() {
        color = "yellow";
    }

    // Implementation of the abstract walk method for Chicken
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}
