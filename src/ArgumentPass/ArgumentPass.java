package ArgumentPass;

 public class ArgumentPass {
     static void main() {
         int x = 10,y=20;
         System.out.println("Before increament , x ="+x+", y ="+y);
         increament(x,y);
         System.out.println("After increament , x ="+x+", y ="+y);
     }

     public static void increament(int a , int b) {
         a = a+5;  //even i change name a to x also same reult
         b = b+5;
     }
}
