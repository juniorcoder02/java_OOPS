public class MultilevelInheritance {

    public static void main(String[] args) {
        Dog bruno = new Dog();
        bruno.Bark(); // its own property
        bruno.leg = 4; // inerits from its base class "Mammals""
        System.out.println("bruno has " + bruno.leg + " legs");
        bruno.breath(); // inerits from its super base class "Animal
    }

}

// In the multi level inheritance one base class , and one or more derived class
// are participate.
// in other words one derived class inherits the properties of its base class
// and the 2nd derived class inherit the properties of its base class so the 2nd
// derived class have
// both the proerties of its parent class and its grand parent class
// For Example

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

// Derived class
class Mammals extends Animal {
    int leg;

}

// 2nd Derived class inherits from its parent class
class Dog extends Mammals {
    String breed;

    public void Bark() {
        System.out.println("Dog can Bark ");
    }
}
