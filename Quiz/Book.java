package Quiz;

public class Book   {
    private String title;
    private String author;
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        // "this." is used to assign values to the private instance variables (title, author, and pageCount)
    }
    public static void main(String[] args) {
        Book TheGreatGatsby = new Book("The Great Gatsby", "F. Scott Fitzgerald", 250);

        System.out.println("Title: " + TheGreatGatsby.title);
        System.out.println("Author: " + TheGreatGatsby.author);
        System.out.println("Page Count: " + TheGreatGatsby.pageCount);
    }
}
