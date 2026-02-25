package finalKeyword;

// 🔷 Class representing a Circle
class Circle {

    private int rad;   // Radius of circle

    // ⭐ FINAL VARIABLE
    // Once assigned, its value CANNOT be changed again
    private final double pi;

    // 🔹 Default Constructor
    public Circle() {

        // ⭐ IMPORTANT:
        // A final instance variable MUST be initialized
        // either at declaration OR inside every constructor

        pi = 3.14;   // Initializing final variable
        rad = 4;
    }

    // 🔹 Parameterized Constructor
    public Circle(int r) {

        // ⭐ Each constructor must initialize the final variable
        // because Java must guarantee it gets value exactly once

        pi = 3.14;   // Not reassigning — assigning for this object
        rad = r;
    }

    // 🔹 Method to display values
    public void show() {
        System.out.println("Radius = " + rad + ", Pi = " + pi);
    }
}

// 🔷 Main class
public class Variable {

    public static void main(String[] args) {

        // Creating object using parameterized constructor
        Circle c = new Circle(6);

        // Calling method
        c.show();
    }
}