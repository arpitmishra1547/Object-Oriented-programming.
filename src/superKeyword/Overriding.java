package superKeyword;
class Frontnd {
    public void skill(){
        System.out.println("i know frontend");
    }

    public void display(){
        System.out.println("I DISPLAYED OBJECT");
    }
}
class Fullstack extends Frontnd {

    public void skill(){
        System.out.println("i am fullstack developer");
        super.skill();
        display();// first line is not compulsary for this
        System.out.println("i know backend also");
    }
}

public class Overriding {
    static void main() {
      Fullstack obj = new Fullstack();
      obj.skill();
    }
}
