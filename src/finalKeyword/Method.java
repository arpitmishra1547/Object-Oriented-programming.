package finalKeyword;

// 🔷 Parent class
class Bike {

    // ⭐ FINAL METHOD
    // A final method CANNOT be overridden by any subclass
    // Purpose: To lock the behavior so child classes cannot change it
    public final void speed() {
        System.out.println("Top speed is 120 kmph");
    }
}

// 🔷 Child class
class Honda extends Bike {

    // ❌ NOT ALLOWED:
    // Cannot override because method in parent class is final

    /*
    public void speed() {
        System.out.println("Top speed is 340 kmph");
    }
    */

    // ⭐ Honda still inherits the speed() method
    // It can USE it but CANNOT modify it
}


// 🔴 FINAL CLASS EXAMPLE
// A final class CANNOT be inherited (no subclass allowed)
final class Yamaha {

    public void info() {
        System.out.println("Yamaha is a final class");
    }
}

// ❌ This would cause COMPILE-TIME ERROR
/*
class R15 extends Yamaha { }   // Not allowed
*/


// 🔷 Main class
public class Method {

    public static void main(String[] args) {

        // Creating object of Honda (child class)
        Honda kmz = new Honda();

        // Calling inherited final method
        kmz.speed();

        // Creating object of final class
        Yamaha y = new Yamaha();
        y.info();
    }
}