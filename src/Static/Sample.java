package Static;

public class Sample {
    int a = 10; //instance variable

    static void main() {
        Sample s = new Sample();
//        System.out.println(a); it is possible when a is static
        System.out.println("a is "+s.a);
    }
}
