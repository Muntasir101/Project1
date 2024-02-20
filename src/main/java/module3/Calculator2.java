package module3;
import static module3.Calculator1.summation;


public class Calculator2 {
    private static int number1= 10;
    private static int number2=5;

   // public static int result;

    public static int multiplication(){
        return number1 * number2;
    }

    public static void division(int myNumber1, int myNumber2){
        int result = myNumber1 / myNumber2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        // Calculator1 properties
        summation();
        Calculator1 obj = new Calculator1();
        obj.subtraction();

        // Calculator2 properties
        // multiplication();
       // System.out.println(multiplication());
        int multipleResult = multiplication();
        System.out.println(multipleResult);
        //division();
        //System.out.println(result);

        division(100,20);
        division(200, 10);
    }
}
