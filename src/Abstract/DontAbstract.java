package Abstract;

// =============================================================
// ABSTRACT CLASS
// =============================================================

abstract class Vehicle {

    // =========================================================
    // ❌ 1) ABSTRACT CONSTRUCTOR — NOT ALLOWED
    // =========================================================

    /*
    Constructors are used to create objects.
    Constructors are NOT inherited by subclasses.
    Abstract methods MUST be overridden in child class.
    Since constructor cannot be overridden → cannot be abstract.
    */

    // ❌ Illegal (compile-time error)
    // abstract Vehicle();

    // ✔ Allowed: abstract class can have constructor
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }


    // =========================================================
    // ❌ 2) ABSTRACT + FINAL METHOD — NOT ALLOWED
    // =========================================================

    /*
    abstract → child MUST override
    final    → child CANNOT override

    Both together create contradiction ❌
    */

    // ❌ Illegal
    // abstract final void fuelType();

    // ✔ Allowed: final method (cannot be overridden)
    final void fuelType() {
        System.out.println("Fuel type: Petrol/Diesel");
    }


    // =========================================================
    // ❌ 3) ABSTRACT + PRIVATE METHOD — NOT ALLOWED
    // =========================================================

    /*
    private methods are NOT visible to subclass
    So child cannot override them
    abstract requires overriding → impossible ❌
    */

    // ❌ Illegal
    // private abstract void service();

    // ✔ Allowed: private method but not abstract
    private void service() {
        System.out.println("Private service method");
    }


    // =========================================================
    // ✔ VALID ABSTRACT METHOD
    // =========================================================

    /*
    Abstract method must be:
    ✔ Inherited
    ✔ Visible to child
    ✔ Overridable
    */

    abstract void start();
}


// =============================================================
// CHILD CLASS
// =============================================================

class Car extends Vehicle {

    // MUST override abstract method
    @Override
    void start() {
        System.out.println("Car starts with key");
    }

    // Cannot override final method fuelType()
    // ❌ This would cause compile-time error
    /*
    void fuelType() {
        System.out.println("Electric");
    }
    */
}


// =============================================================
// MAIN CLASS (Must match file name)
// =============================================================

public class DontAbstract {

    public static void main(String[] args) {

        Vehicle v = new Car();

        v.start();      // Runtime polymorphism
        v.fuelType();   // Calls final method from parent

        /*
        Private method service() cannot be accessed here
        because it is not visible outside Vehicle class
        */
    }
}