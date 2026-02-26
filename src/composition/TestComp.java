package composition;

class College {
    private String collName;
    private int estYear;
    private final Department dept;   // Composition

    // Constructor
    public College(String collName, int estYear,
                   String depName, String hodName) {

        this.collName = collName;
        this.estYear = estYear;
        this.dept = new Department(depName, hodName);
    }

    // Method to display complete details
    public void showDetails() {
        System.out.println("College Name: " + collName);
        System.out.println("Establishment Year: " + estYear);
        System.out.println(dept);  // calls toString()
    }

    // Inner class → strong ownership → Composition
    private class Department {
        private String depName;
        private String hodName;

        public Department(String depName, String hodName) {
            this.depName = depName;
            this.hodName = hodName;
        }

        @Override
        public String toString() {
            return "Department Name: " + depName +
                    ", HOD Name: " + hodName;
        }
    }
}

public class TestComp {
    public static void main(String[] args) {

        College coll = new College(
                "IIT Delhi",
                1961,
                "Computer Science",
                "Dr. Arpit"
        );

        coll.showDetails();
    }
}