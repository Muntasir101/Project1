package module3;

public class StringDemo {
    public static void main(String[] args) {
        String message = "Hello, world!";

        int messageLength = message.length();
        System.out.println(messageLength);

        char ch = message.charAt(7);
        System.out.println(ch);

        String sub = message.substring(7);
        System.out.println(sub);

        String sub2 = message.substring(7, 10);
        System.out.println(sub2);

        String upperCase = message.toUpperCase();
        System.out.println(upperCase);

        String lowerCase = message.toLowerCase();
        System.out.println(lowerCase);

        boolean isEquals = message.equals("hello, world!");
        System.out.println(isEquals);

        boolean isEqualIgnoreCase = message.equalsIgnoreCase("hello, world!");
        System.out.println(isEqualIgnoreCase);

        int index = message.indexOf('w');
        System.out.println(index);

        boolean messageStartsWith = message.startsWith("Hello");
        System.out.println(messageStartsWith);

        boolean messageEndsWith = message.endsWith("World!");
        System.out.println(messageEndsWith);

    }
}
