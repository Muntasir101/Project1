package module36;

public class SuperExample {
    public static void main(String[] args) {
        Child1 smith = new Child1();
        smith.display();

        Child2 david = new Child2();
        david.shout();
    }
}

class Parent{
    int parentVariable1 = 10; // instance variable

    void display(){
        System.out.println("Parent Class");
    }
}

class Child1 extends Parent{
    int childVariable1 = 20;

    void display(){
        super.display();
        System.out.println("Child1 Class");
    }
}

class Child2 extends Parent{
    int childVariable2 = 30;

    void shout(){
        super.display();
        System.out.println("Child2 Class");
        System.out.println("Parent variable1: "+ super.parentVariable1);
    }
}
