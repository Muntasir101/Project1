package module36;

class Book{
    private final String title;
    private final String author;
    private final int year;

    private int price;

    private int rating;

   // Constructor 1
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Constructor 2
    public Book(String title, String author, int year, int price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    // Constructor 3
    public Book(String title, String author, int year, int price,int rating) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
}

public class ConstructorProject {
    public static void main(String[] args) {
        // Constructor 1 initialize
        Book book1 = new Book("The Archer","Paulo",2020);
        System.out.println("Book1 Title: "+ book1.getTitle());
        System.out.println("Book1 Author: "+ book1.getAuthor());
        System.out.println("Book1 Year: "+ book1.getYear());

        // Constructor 1 initialize
        Book book2 = new Book("Head First Java","Kathy Sierra",2000);
        System.out.println("Book2 Title: "+ book2.getTitle());
        System.out.println("Book2 Author: "+ book2.getAuthor());
        System.out.println("Book2 Year: "+ book2.getYear());

        // Constructor 2 initialize
        Book book3 = new Book("Java Programming","Smith",2000,200);
        System.out.println("Book3 Price: "+ book3.getPrice());

        // Constructor 3 initialize
        Book book4 = new Book("The Java","Paulo",2020,100,5);
        System.out.println("Book4 Rating: "+ book4.getRating());

        // Constructor 3 initialize
        Book book5 = new Book("The Java2","Paulo",2020,100,5);
        System.out.println("Book5 Rating: "+ book4.getRating());

        Book book6 = new Book("hello","John",2000);
    }

}
