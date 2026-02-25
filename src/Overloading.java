public class Overloading {
    public int add(int a, int b) {
        return a+b;
    }
    public int add(int a, int b,int c) {
        return a+b+c;
    }
    public double add(double a, double b) {
        return a+b;
    }
    public String add(String a,String b){
        return a+b;
    }

    public void show(int age,String name){
        System.out.println(age);
        System.out.println(name);
    }

}

    class useOverloading {
    static void main() {
        Overloading obj = new Overloading();
        obj.add("Ashu","Mishra");
        obj.show(16,"Ashu");
    }
}
