package module3;

public class Calculator1 {
    private static int number1= 10;
    private static int number2=5;

    public static void summation(){
        int result = number1 + number2;
        System.out.println(result);
    }

    public void subtraction(){
        int result = number1 - number2;
        System.out.println(result);

    }

    public static void main(String[] args) {
        summation();

        Calculator1 obj = new Calculator1();
        obj.subtraction();
    }
}
