package OOP;

public class Abstraction {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.eat();
    }
}

abstract class Animals {
    abstract void makeSound();

    void eat() {
        System.out.println("Animal is Eating");
    }
}

class Dog extends Animals {
    void makeSound() {
        System.out.println("Dog is Barking");
    }
}

