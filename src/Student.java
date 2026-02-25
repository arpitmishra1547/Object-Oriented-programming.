public class Student {
//    int roll;
//    String name;
//    double per;

//    for achieve encapsulation
   private int roll;
   private String name;
   private double per;

   // setter
    public void setStudent(int r,String s,double p){
        if(r<0) System.out.println("Not Valid Number");
        else roll = r;
        name = s;
        per = p;
    }

    public void showStudent(){
        System.out.println("Roll=" + roll);
        System.out.println("Name=" +name);
        System.out.println("per=" +per);
    }

    public Student(){    // initialise meaningful value instaed of default using constructor
        System.out.println("constructor called ...");
         roll = 1;
         name = "Ashu";
         per = 56.3;
         // but problem is when multiple object create then everytime have same data shown so for this problem resolve we make parametrised constructor
    }
    public Student(int r,String s,double d) {    // parametrized constructor
        System.out.println("constructor called ...2");
        roll = r;
        name = s;
        per = d;
    }

}
 class UseStudent{
     static void main() {
         Student s;
         s = new Student();   // constructor called implicitely
//         s.roll = 10;            // directly not be accessed due to encapsulation
//         System.out.println(s.roll);

         s.setStudent(-54,"Arpit",34.4);
         s.showStudent();



         Student s1 = new Student(12,"Ashu",33.3);
         s.showStudent();
     }
 }

