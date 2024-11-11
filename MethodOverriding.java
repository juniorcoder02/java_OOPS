public class MethodOverriding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
    }
}

// Example of a method overriding
// it is a run time polymorphism
class Animal {
    void eat() {
        System.out.println("Eat anything");
    }
}

class Deer extends Animal {
    
    void eat() {
        System.out.println("Eat Grass");
    }

    // here both Animal and Deer class have same function "eat" with different
    // Definition
    // if we create the object of the derived class it exectue the function of
    // derived class and not base class.
}