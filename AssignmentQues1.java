import java.util.Scanner;

public class AssignmentQues1 {

    // Inner class representing a Complex number
    class Complex {
        private double real;      // Real part of the complex number
        private double imaginary; // Imaginary part of the complex number

        // Constructor to initialize a complex number with real and imaginary parts
        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        // Method to add this complex number with another complex number
        public Complex add(Complex other) {
            double realPart = this.real + other.real;           // Add real parts
            double imaginaryPart = this.imaginary + other.imaginary; // Add imaginary parts
            return new Complex(realPart, imaginaryPart);        // Return result as new Complex object
        }

        // Method to subtract another complex number from this complex number
        public Complex subtract(Complex other) {
            double realPart = this.real - other.real;           // Subtract real parts
            double imaginaryPart = this.imaginary - other.imaginary; // Subtract imaginary parts
            return new Complex(realPart, imaginaryPart);        // Return result as new Complex object
        }

        // Method to multiply this complex number with another complex number
        public Complex multiply(Complex other) {
            // Calculate real and imaginary parts using complex number multiplication formula
            double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
            double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
            return new Complex(realPart, imaginaryPart);        // Return result as new Complex object
        }

        // Method to represent the complex number as a string for display
        @Override
        public String toString() {
            return this.real + " + " + this.imaginary + "i";
        }
    }

    // Main method to test the Complex class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();

        // Input for the second complex number
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();

        // Create instances of the Complex class with the given inputs
        AssignmentQues1 assignment = new AssignmentQues1(); // Create an instance of the outer class
        Complex complex1 = assignment.new Complex(real1, imaginary1); // First complex number
        Complex complex2 = assignment.new Complex(real2, imaginary2); // Second complex number

        // Perform addition, subtraction, and multiplication on the complex numbers
        Complex sum = complex1.add(complex2);           // Sum of the two complex numbers
        Complex difference = complex1.subtract(complex2); // Difference of the two complex numbers
        Complex product = complex1.multiply(complex2);  // Product of the two complex numbers

        // Display results
        System.out.println("\nSum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        scanner.close(); // Close the scanner
    }
}
