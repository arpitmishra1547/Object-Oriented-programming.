class Data {
    static int a = 10; //
    static{
        System.out.println("first static block called..."+a);//if a is not static then it is not allowed
    }
    static{
        System.out.println("second static block called...");
    }

    public Data(){
        System.out.println("constructor called...");
    }

    public static void show(){
        System.out.println("show called...");
    }
}

 class UseData {
    static void main() {
        Data.show();
        Data d1 = new Data();
        Data d2 = new Data();
        Data d3 = new Data();
    }
}








public class StaticBlock {

}
