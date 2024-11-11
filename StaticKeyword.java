// Main class to demonstrate the static keyword in Java
public class StaticKeyword {
    public static void main(String[] args) {
        // Creating the first Student object
        Student s1 = new Student();
        s1.schoolName = "KRHS";  // Setting schoolName through s1

        // Creating the second Student object
        Student s2 = new Student();
        
        // Since schoolName is static, it’s shared between all instances
        // This will print "KRHS" because s1's change affects s2's schoolName as well
        System.out.println(s2.schoolName);
    }
}

// Student class with a static field
class Student {
    String name;
    int roll;

    // Static field: this is shared across all instances of the Student class
    static String schoolName;

    // Method to set the name of the student
    void setName(String name) {
        this.name = name;
    }

    // Method to get the name of the student
    String getName() {
        return this.name;
    }
}
