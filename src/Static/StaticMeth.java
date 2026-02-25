package Static;

class MyMath{
    public static int add(int a, int b){
        return a+b;
    }
}

public class StaticMeth {
    static void main(String[] args) {
        System.out.println("sum of 10 and 20 is "+MyMath.add(10,20));
    }
}