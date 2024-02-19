package module3;

public class ArrayLoops {
    static Integer[] intArray = {11, 2, 34};
    static String[] strArray ={"dhaka","ny", "paris"};

    public static void main(String[] args) {
        printAllIntValues();
        //printAllStrValues();
        printAllValues(intArray);
        printAllValues(strArray);
    }

    public static void printAllIntValues() {
        /*
        // for loop iteration
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        */

        for(int value:intArray) {
            System.out.println(value);
        }
    }

    public static void printAllStrValues() {
        // for loop iteration
        for(int i = 0; i <strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }

    public static <T> void printAllValues(T[] array) {
        // for loop iteration
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static <T> void printAllValues2(T[] array) {
        // for loop iteration
        for(int i:intArray) {
            System.out.println(array[i]);
        }
    }

}
