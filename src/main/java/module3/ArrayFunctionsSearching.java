package module3;
import java.util.Arrays;

public class ArrayFunctionsSearching {
    public static void main(String[] args) {
        int[] ProductIDs = {11,2,34,24,55,16,47,8,79,10};

        int index = Arrays.binarySearch(ProductIDs,10);
        System.out.println("index of : " + index);
    }
}
