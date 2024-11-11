// Main class to demonstrate the super keyword
public class SuperKeyword {
    public static void main(String[] args) {
        // Creating a Horse object, which triggers both Animal and Horse constructors
        Horse h1 = new Horse();
    }
}

// Animal class (superclass)
class Animal {
    String color;

    // Constructor of Animal class
    Animal() {
        System.out.println("Animal constructor called");
    }

    // Method to describe eating behavior
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Horse class (subclass) extending Animal
class Horse extends Animal {
    String color;

    // Constructor of Horse class
    Horse() {
        // Calling superclass constructor explicitly using super()
        super();
        System.out.println("Horse constructor called");
    }

    // Method that uses super to call the superclass method
    void eat() {
        // Calling eat method of superclass using super
        super.eat();
        System.out.println("Horse eats grass");
    }

    // Method to set color of Horse and display the colors of both superclass and subclass
    void setColor(String color) {
        this.color = color; // Setting color in Horse
        super.color = "brown"; // Setting color in Animal

        System.out.println("Horse color: " + this.color);
        System.out.println("Animal color: " + super.color);
    }
}
