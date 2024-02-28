package module36;

public class ConstructorDemo {
    public static String variable1 = "instance variables";

    public static void main(String[] args) {
        // Create object
        ConstructorDemo obj1 = new ConstructorDemo();
        ConstructorDemo obj2 = new ConstructorDemo();
        ConstructorDemo obj3 = new ConstructorDemo();

        obj1.method1();

    }
    // Parameterize constructor
    public ConstructorDemo(){
        System.out.println("Constructor initialized");
    }
    public void method1() {
        int number1= 20;
        System.out.println("Method 1 called");
        System.out.println(variable1);
    }
    public void method2() {
        System.out.println("Method 2 called");
        System.out.println(variable1);
    }
}
