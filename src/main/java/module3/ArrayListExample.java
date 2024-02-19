package module3;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating a new ArrayListExample of String
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("banana");

        numbers.add(10);
        numbers.add(12);
        numbers.add(3);
        numbers.add(50);

        System.out.println(fruits); //[orange, apple, banana]

        System.out.println(fruits.size()); //3

        // Accessing the elements by index
        System.out.println(fruits.get(0)); //orange

        // iterate over the elements
        for(String fruit:fruits){
            System.out.println(fruit);
        }

        // iterate over the elements with condition
        for(Integer number:numbers){
            if(number%2==0){
                System.out.println(number + " is Even");
            }
            else{
                System.out.println(number + " is Odd");
            }
        }

        // remove item
        fruits.remove(2);
        System.out.println(fruits); //[orange, apple]

        // checking if the element is present in the list
        boolean elementPresentStatus=fruits.contains("apple");
        System.out.println(elementPresentStatus); // true

        // clear the list
        fruits.clear();
        System.out.println(fruits); // []
    }
}
