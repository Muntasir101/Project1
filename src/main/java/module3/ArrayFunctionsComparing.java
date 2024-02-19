package module3;
import java.util.Arrays;

public class ArrayFunctionsComparing {
    public static void main(String[] args) {
        int[] intArray1 = {11,2,34};
        int [] intArray2 = {10,20,22};

        boolean arrayCompare = Arrays.equals(intArray1, intArray2);
        System.out.println(arrayCompare); // false

        String[] strArray1 = { "peach", "apple", "orange", "banana"};
        String[] strArray2 = { "peach", "apple", "orange", "banana"};
        boolean arrayCompare2 = Arrays.equals(strArray1, strArray2);
        System.out.println(arrayCompare2); // true
    }
}
