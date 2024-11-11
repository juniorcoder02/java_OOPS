public class Constructor {
    public static void main(String[] args) {
        // Create a new Student object 's1' using the default (no-argument) constructor
        Student s1 = new Student();
        
        // Create a new Student object 's2' using the parameterized constructor
        Student s2 = new Student("Adnan", 16);
        // Print the name and roll number of 's2'
        System.out.println("Student name : " + s2.name);
        System.out.println("Student Roll No : " + s2.roll);

        // Create a new Student object 's3' by copying 's2' using the copy constructor
        Student s3 = new Student(s2);
        // Reinitialize the roll number for 's3' (demonstrating customization after copying)
        s3.roll = 20;
        
        // Print the name and roll number of 's3'
        System.out.println("Student name : " + s3.name);
        System.out.println("Student roll no. : " + s3.roll);
    }
}

// Student class demonstrating different types of constructors
class Student {
    String name;  // Field for student's name
    int roll;     // Field for student's roll number

    // Default (no-argument) constructor
    Student() {
        System.out.println("Non-parameterized constructor called!");
    }

    // Parameterized constructor: initializes the 'name' and 'roll' with given values
    Student(String name, int roll) {
        System.out.println("Parameterized constructor called with name and roll number!");
        this.name = name;
        this.roll = roll;
    }

    // Copy constructor: creates a new object by copying another object's data
    Student(Student s2) {
        System.out.println("Copy constructor called!");
        // Copies the name from the given student object 's2' to this new object
        this.name = s2.name;
    }
}
