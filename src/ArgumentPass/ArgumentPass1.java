package ArgumentPass;

import java.util.ArrayList;

public class ArgumentPass1 {
    static void main() {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(4);
        System.out.println(myList);
        change(myList);
        System.out.println(myList);
    }
    public static void change(ArrayList<Integer> myList){
//        myList = new ArrayList<>();
        myList.add(3);
        myList.add(5);
    }
}
