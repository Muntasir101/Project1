package module3;

public class Calculator3 {

    private static int conNumber1;
    private static int conNumber2;

    // Constructor
    public Calculator3(int conNumber1, int conNumber2){
        Calculator3.conNumber1=conNumber1;
        Calculator3.conNumber2=conNumber2;
    }

    public void summation(){
        int result = conNumber1 + conNumber2;
        System.out.println(result);
    }

    public void subtraction(){
        int result = conNumber1 - conNumber2;
        System.out.println(result);

    }

    public static void main(String[] args) {
        Calculator3 obj = new Calculator3(200,50);
        obj.summation(); //250
        obj.subtraction(); //150

        Calculator3 obj2 = new Calculator3(500,400);
        obj2.summation(); // 900
        obj2.subtraction(); //100
    }
}
