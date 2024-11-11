public class Inheritance {
    public static void main(String[] args) {
        Fish hell = new Fish();
        hell.swim(); // fish own property
        // Inherited properties from its base class "Animal"
        hell.color = "black";
        System.out.println(hell.color + " fish");
        hell.breath();
    }
}

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

// Derived class inherit from aniaml class
class Fish extends Animal {
    int fins;

    public void swim() {
        System.out.println("fish can swim");
    }

}

//  This inheritance is also called a single level Inheritance where a one base class and one derived class perform inheritance