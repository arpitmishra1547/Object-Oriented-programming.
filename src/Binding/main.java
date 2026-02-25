package Binding;

// 🔷 Parent class
class Parent {

    // ⭐ STATIC METHOD
    // Static methods are NOT overridden — they are hidden
    // Binding happens at COMPILE TIME (Early Binding)
    public static void show() {
        System.out.println("Static show() of Parent class");
    }

    // ⭐ INSTANCE METHOD
    // Can be overridden
    // Binding happens at RUN TIME (Late Binding)
    public void display() {
        System.out.println("Instance display() of Parent class");
    }
}

// 🔷 Child class
class Child extends Parent {

    // ⭐ This is METHOD HIDING (not overriding)
    // Because static methods cannot be overridden
    public static void show() {       // its should be static bcz in parent class this function is static. if not then it give error
        System.out.println("Static show() of Child class");
    }

    // ⭐ This is METHOD OVERRIDING
    // Same method signature as parent
    @Override
    public void display() {           // if this function make static then it give error bcz in parent class this function is instance method
        System.out.println("Instance display() of Child class");
    }
}


// 🔷 Main class
 class Binding {

    public static void main(String[] args) {

        // 🔹 Case 1: Parent reference → Parent object
        Parent p = new Parent();

        p.show();     // Calls Parent.show() → Early binding
        p.display();  // Calls Parent.display()

        System.out.println("-------------------");

        // 🔹 Case 2: Parent reference → Child object
        p = new Child();

        // ⭐ STATIC METHOD CALL
        // Decided by REFERENCE TYPE (Parent)
        // NOT by object type
        p.show();     // Calls Parent.show()

        // ⭐ INSTANCE METHOD CALL
        // Decided by OBJECT TYPE (Child)
        // Runtime decides → Late binding
        p.display();  // Calls Child.display()
    }
}