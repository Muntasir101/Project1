package Excpetions;

// Java program to demonstrate ArithmeticException
class ArithmeticException_Demo
{
    public static void main(String[] args)
    {
        try {
            int a = 30, b = 10;
            int c = a/b; // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(Exception error) {
            System.out.println ("Exception is: " +error);
        }
        System.out.println("hello world");
    }
}

