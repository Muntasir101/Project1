package module3;

public class ArrayConditional {
    public static void main(String[] args) {
        Integer[] Numbers = {11, 2, 34, 10};

        for(int number:Numbers){
            if(number%2==0){
                System.out.println(number + " is Even");
            }
            else{
                System.out.println(number + " is Odd");
            }
        }

        for(int number:Numbers){
            if(number>10){
                System.out.println("Numbers Greater than 10: " + number);
            }
        }

    }
}
