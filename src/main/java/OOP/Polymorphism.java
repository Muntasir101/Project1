package OOP;

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println(summation(10,20));
        System.out.println(summation(10,20,30));
        System.out.println(summation(20,10.5,50));

        Calculator.summation();
    }
    public static int summation(int number1, int number2){
        return number1+number2;
    }
    public static int summation(int number1, int number2, int number3){
        return number1+number2+number3;
    }
    public static int summation(int number1, double number2, int number3){
        return (int) (number1+number2+number3);
    }
}

class Calculator extends Polymorphism {
    public static void summation(){
        int number1 = 100;
        int number2 = 50;
        int result =number1+number2;
        System.out.println(result);
    }
}
