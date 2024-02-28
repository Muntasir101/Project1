package module36;

class Book{
    private final String title;
    private final String author;
    private final int year;


   // Constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
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
}

public class ConstructorProject {
    public static void main(String[] args) {
        Book book1 = new Book("The Archer","Paulo Coelho",2020);
        System.out.println("Book1 Title: "+ book1.getTitle());
        System.out.println("Book1 Author: "+ book1.getAuthor());
        System.out.println("Book1 Year: "+ book1.getYear());

        Book book2 = new Book("Head First Java","Kathy Sierra",2000);
        System.out.println("Book2 Title: "+ book2.getTitle());
        System.out.println("Book2 Author: "+ book2.getAuthor());
        System.out.println("Book2 Year: "+ book2.getYear());
    }

}
