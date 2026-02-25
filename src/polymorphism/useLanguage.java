package polymorphism;
class Language{
    public void greeting(){

    }
}
 class Hindi extends Language {
    public void greeting(){
        System.out.println("suprabhat");
    }
}
class English extends Language {
    public void greeting(){
        System.out.println("good morinig");
    }
}
class French extends Language {
    public void greeting(){
        System.out.println("Bon jour");
    }
}

public class useLanguage {
    static void main() {
        // Non- polymorphic method
       /*  Hindi h = new Hindi();
        h.greeting();
        English e = new English();
        e.greeting();
        French f = new French();
        f.greeting();   */


        // Polymorphic method
        Language lan;
        lan = new Hindi();
        lan.greeting();
        lan= new English();
        lan.greeting();
        lan = new French();
        lan.greeting();


    }
}
