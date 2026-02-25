package interfaceExam;

// =====================================================
// INTERFACE
// =====================================================

interface Animal {

    // Automatically: public abstract
    void makeSound();

    void eat();
}


// =====================================================
// CLASS 1
// =====================================================

class Elephant implements Animal {

    @Override
    public void makeSound() {
        System.out.println("An elephant makes trumpet sound");
    }

    @Override
    public void eat() {
        System.out.println("Elephant eats grasses and leaves");
    }
}


// =====================================================
// CLASS 2
// =====================================================

class Lion implements Animal {

    @Override
    public void makeSound() {
        System.out.println("A lion roars");
    }

    @Override
    public void eat() {
        System.out.println("A lion eats flesh");
    }
}


// =====================================================
// MAIN CLASS (Must be public)
// =====================================================

public class UseAnimal {

    public static void main(String[] args) {

        Animal animal;

        animal = new Elephant();
        animal.makeSound();
        animal.eat();

        animal = new Lion();
        animal.makeSound();
        animal.eat();
    }
}