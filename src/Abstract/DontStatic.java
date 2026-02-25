package Abstract;

class A {

    // Static method → belongs to CLASS, not object
    // Static methods are resolved at COMPILE TIME (Early Binding)
    public static void show() {
        System.out.println("In show of A");
    }

    /*
    ❌ Why we cannot make static method abstract?

    1) abstract method → must be overridden by subclass
    2) static method → CANNOT be overridden (only hidden)
    3) abstract requires runtime polymorphism
    4) static uses compile-time binding

    👉 Therefore: "abstract static" is ILLEGAL in Java

    abstract static void show();   // ❌ Compile-time error
    */
}

class B extends A {

    // This is NOT overriding
    // This is METHOD HIDING

    public static void show() {
        System.out.println("In show of B");
    }

    /*
    IMPORTANT:
    Static methods cannot be overridden.
    They are hidden, not polymorphic.
    */
}

public class DontStatic {

    // Correct main signature required to run program
    public static void main(String[] args) {

        A obj = new B();

        /*
        ⚠️ IMPORTANT POLYMORPHISM RULE

        For static methods:
        Method call depends on REFERENCE TYPE
        NOT on OBJECT TYPE

        Reference type = A
        Object type = B

        So A.show() is called, NOT B.show()
        */

        obj.show();
    }
}