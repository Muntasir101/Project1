package module3;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayFunctionsSorting {
    public static void main(String[] args) {
        int[] intArray = {11,2,34,24,55,16,47,8,79,10};
        System.out.println(intArray[0]);

        // Length of array
        System.out.println(intArray.length);

        // Sorting
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        //System.out.println("Sorted array: "+ Arrays.toString(intArray));

        String[] strArray = { "peach", "apple", "orange", "banana"};
        // Sorting
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        //Sorting - descending
        Integer[] intArray2 = {11,2,34,24,55,1,10};
        Arrays.sort(intArray2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(intArray2));

    }
}
