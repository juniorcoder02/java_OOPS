public class GettersSetters {
    public static void main(String[] args) {
        // Create a new Pen object 'p1'
        Pen p1 = new Pen();
        
        // Set the color of the pen using the setter method
        p1.setColor("blue"); 
        // Get the color of the pen using the getter method and print it
        System.out.println(p1.getColor());
        
        // Set the tip size of the pen using the setter method
        p1.setTip(4); 
        // Get the tip size of the pen using the getter method and print it
        System.out.println(p1.getTip()); 
    }
}

// Pen class representing attributes of a pen with encapsulation
class Pen {
    // Private fields for color and tip size, accessible only within the Pen class
    private String color;
    private int tip;

    // Getter method to access the private field 'color' outside the class
    String getColor() {
        return this.color;
    }

    // Getter method to access the private field 'tip' outside the class
    int getTip() {
        return this.tip;
    }

    // Setter method to set the private field 'color' from outside the class
    void setColor(String color) {
        this.color = color;
    }

    // Setter method to set the private field 'tip' from outside the class
    void setTip(int tip) {
        this.tip = tip;
    }
}
