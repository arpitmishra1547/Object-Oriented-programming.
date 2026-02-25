package thisKeyword;

 class Student{
    private int roll;
    private String name;
    private int per;

    public void setStudent(int roll,String name,int per){
        this.roll = roll;   //roll = roll (means its roll is point to parameter rolll and instance roll never change
        this.name = name ;
        this.per = per;
    }
    public void  show(){
        System.out.println(roll + name +per);
    }

}

public class ThisKeyWord {
    static void main() {
        Student s = new Student();
        s.setStudent(23,"Ashu",34);
        s.show();
    }
}
