public class OopsBasics {
    public static void main(String[] args) {
        // Create a new Student object 's1'
        Student s1 = new Student();
        s1.setName("Adnan");   // Set the name of the student using the setName method
        s1.age = 20;            // Set the age of the student directly (age is public)

        // Calculate the student's percentage based on three subjects' marks
        s1.calcPercentage(90, 92, 96);

        // Print student details: name, age, and calculated percentage
        System.out.println("Student name : " + s1.name);
        System.out.println("Student age : " + s1.age);
        System.out.println("Student percentage : " + s1.percentage);

        // Create a new BankAccount object 'b1'
        BankAccount b1 = new BankAccount();
        b1.username = "Adnan";   // Set the username (username is public)

        // b1.password = "xyz";  // Not allowed since 'password' is private

        // Set the password using the public setPassword method
        b1.setPassword("xyz");  

        // Trying to access 'password' directly would throw an error, as it's private
        // However, we can use a public method to access it, if such a method exists
        b1.printPassword(); // Print the password using a public method
    }
}

// Student class represents a student's details and functionalities
class Student {
    String name;       // public by default (accessible outside the class)
    int age;           // public by default
    float percentage;  // public by default

    // Method to set the student's namek
    void setName(String newName) {
        name = newName;
    }

    // Method to set the student's age
    void setAge(int newAge) {
        age = newAge;
    }

    // Method to calculate the percentage based on subject marks
    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}

// BankAccount class encapsulates sensitive data (like password)
class BankAccount {
    public String username;   // public, can be accessed outside the class
    private String password;  // private, accessible only within this class

    // Method to set the password
    public void setPassword(String newPassword) {
        password = newPassword;
    }

    // Public method to print the password (not ideal in a real application for security)
    public void printPassword() {
        System.out.println("Password: " + password);
    }
}

