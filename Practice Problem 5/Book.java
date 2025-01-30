public class Book  {
    String title;
    String author;

    public Book(String title) {
        this.title = title;
        this.author = null;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        if (author != null) {
            System.out.println("Author: " + author);
        } else {
            System.out.println("Author: Not available");
        }
    }


    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("1984", "George Orwell");

        System.out.println("Book 1 Details:");
        book1.displayBook();

        System.out.println("Book 2 Details:");
        book2.displayBook();
    }
}
