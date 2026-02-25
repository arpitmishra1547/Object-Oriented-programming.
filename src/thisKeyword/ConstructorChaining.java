package thisKeyword;

  class Studen {
    int roll;
    String name;
    int marks;

    // Constructor 1
    Studen() {
        this(0, "Unknown", 0);   // calls Constructor 3
        System.out.println("Default constructor");
    }

    // Constructor 2
    Studen(int r) {
        this(r, "Unknown", 0);   // calls Constructor 3
        System.out.println("One-parameter constructor");
    }

    // Constructor 3
    Studen(int r, String n, int m) {
        roll = r;
        name = n;
        marks = m;
        System.out.println("Three-parameter constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Studen s = new Studen();
    }
}
