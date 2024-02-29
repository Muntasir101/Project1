package module36;

public class MySuperExample {
    public static void main(String[] args) {

        Department1 department1 = new Department1();
        department1.display();
        Department2 department2 = new Department2();
        department2.display();

    }
}

class Department {
    String department1 = "Computer Science";
    String department2 = "Mathematics";

    void display1() {
        System.out.println("Parent Department");

    }
}
class Department1 extends Department {

    void display() {
        super.display1();
        System.out.println(super.department1);
    }
}

class Department2 extends Department {

    void display() {
        System.out.println(super.department2);
    }
}
