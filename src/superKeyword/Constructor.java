package superKeyword;

// 🔹 Superclass (Parent class)
class Vehicle {

    // Parameterized constructor of parent class
    public Vehicle(String type) {
        System.out.println("The vehicle type is: " + type);
    }
}

// 🔹 Subclass (Child class)
class Car extends Vehicle {

    public Car() {

        // ⭐ IMPORTANT:
        // super("Ashu") calls the constructor of the parent class (Vehicle)
        // Because parent class has ONLY a parameterized constructor,
        // Java CANNOT call it automatically — we must call it explicitly.

        // ⭐ super() MUST be the FIRST statement in the constructor
        super("Car");

        // ⭐ If you don’t write super("Car") here,
        // compilation error will occur because
        // there is NO default constructor in Vehicle.

        System.out.println("Car constructor called...");
    }
}

// 🔹 Main class
public class Constructor {
    public static void main(String[] args) {

        // Creating object of child class
        // 👉 First parent constructor runs
        // 👉 Then child constructor runs
        Car obj = new Car();
    }
}