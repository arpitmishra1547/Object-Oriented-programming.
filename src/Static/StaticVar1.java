package Static;

class Emp{
    private int age;
    private String name;
    private static String comapany="Amazon";
//    static String comapany = new String("Amazom");
//    private String comapany = "Amazon";

    public Emp(int a,String n){
        age = a;
        name = n;
    }

    public void display(){
        System.out.println("age"+age+",name="+name+",comp="+comapany);
    }

    public static void showCompany(){
        System.out.println("companmy name is "+comapany);
    }
}

public class StaticVar1 {
    static void main() {
        Emp.showCompany();
       Emp e = new Emp(21,"Deepak");
       Emp f = new Emp(21,"Deepika");
       Emp g = new Emp(22,"Ashu");
       e.display();
       f.display();
       g.display();



    }
}
