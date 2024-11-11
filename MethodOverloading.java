public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("sum function with 2 int type parameter : " + calc.sum(2, 3));
        System.out.println("sum function with 2 float type parameter : " + calc.sum((float) 2.4, (float) 3.6));
        System.out.println("sum function with 3 int type parameter : " + calc.sum(2, 3, 4));

    }
}

// Example of method overloading using class "Calculator" and function "Sum"
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // same name but different parameters types or count
    // it is a compile time or static polymorphism
}