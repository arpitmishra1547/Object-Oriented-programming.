package getterSetter;

public class Product {
    private int Id;
    private String name;
    private double price;

// normal setter function
//    public void setId(int i){
//        if (i<0) {
//            System.out.println("Id can't be negative");
//            return;
//        }
//        Id = i;
//    }
//    public void setName(String s){
//
//       name = s;
//    }


//    using constructor we made our data member immutable (means one time it set then it will never change )
    public Product(int id,String naam,double pricee){
        Id = id;
        name = naam;
        price = pricee;

    }
    // price can change bcz ssetter function available for price but not id and name
    public void setPrice(double p){
        if(p<0){
            System.out.println("price must be positive");
            return;
        }
        price = p;
    }

    public int getId(){

        return Id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}

class useProduct {
    static void main() {
//        Product p = new Product();
//        p.setId(23);
//        p.setName("Ashu");
//        p.setPrice(36.8);
//
//        System.out.println(p.getId());
//        System.out.println(p.getName());
//        System.out.println(p.getPrice());

//        making data member immutable
        Product p = new Product(23,"Ashu",345.4);
        p.setPrice(34.3);
        System.out.println(p.getId());
        System.out.println(p.getName());
       System.out.println(p.getPrice());

    }
}
