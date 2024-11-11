public class HiraricalInheritance {
    public static void main(String[] args) {
        Birds crow = new Birds();
        crow.fly(); // its own property
        crow.breath(); // inherits from base class
    }
}
// In the Hirarical Inheritance multiple derived classes inherits the properties
// of one base class
// Example

// base class;
class Animal {
    String color;

    public void eat() {
        System.out.println("Animal can eat");
    }

    public void breath() {
        System.out.println("Animal can Breath");

    }
}

// derived class 1
class Mammals extends Animal {
    int legs;

    public void walk() {
        System.out.println("Mammals can walk");
    }
}

// Derived class 2nd
class Birds extends Animal {
    public void fly() {
        System.out.println("Birds can fly");
    }
}