package module3;
import java.util.Arrays;

public class ArrayFunctionsConverting {
    public static void main(String[] args) {
        // int to String conversion
        int[] intArray1 = {11,2,34};
        String newArray = Arrays.toString(intArray1);
        System.out.println(newArray);

        // String to int conversion
        String [] str = {"123", "345", "437", "894"};
        int size = str.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
