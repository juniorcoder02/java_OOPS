// Main class to demonstrate constructor chaining
public class ConstructorChaining {
    public static void main(String[] args) {
        // Creating a Child object, which will trigger constructor chaining
        Child child = new Child("John", 10);
    }
}

// Parent class with constructor chaining to demonstrate superclass constructor call
class Parent {
    String name;

    // Default constructor of Parent class
    Parent() {
        System.out.println("Parent class default constructor called");
    }

    // Parameterized constructor of Parent class
    Parent(String name) {
        this(); // Calls the default constructor of Parent class
        this.name = name;
        System.out.println("Parent class parameterized constructor called with name: " + name);
    }
}

// Child class demonstrating constructor chaining with super
class Child extends Parent {
    int age;

    // Default constructor of Child class
    Child() {
        super("Default Name"); // Calls the parameterized constructor of Parent
        System.out.println("Child class default constructor called");
    }

    // Parameterized constructor of Child class
    Child(String name, int age) {
        this(); // Calls the default constructor of Child class
        this.age = age;
        System.out.println("Child class parameterized constructor called with name: " + name + " and age: " + age);
    }
}
