public class Book {
    String title;
    String author;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        if (author != null) {
            System.out.println("Author: " + author);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist");
        Book book2 = new Book("1984", "George Orwell");

        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
    }
}
