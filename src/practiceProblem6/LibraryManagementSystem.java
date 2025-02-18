package practiceProblem6;
class Book {
    int bookId;
    String bookName;
    String bookAuthor;
    String yearOfPub;
    float price;
    String status;

    public Book(int bookId, String bookName, String bookAuthor, String yearOfPub, float price, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = status;
    }

    void addNewBooks() {
        System.out.println("Adding new book: " + bookName);
    }

    void deleteBooks() {
        System.out.println("Deleting book: " + bookName);
    }

    void displayBookDetails() {
        System.out.println("Book Details - ID: " + bookId + ", Name: " + bookName);
    }

    void inquiryBook() {
        System.out.println("Inquiring about book: " + bookName);
    }
}

class Librarian {
    int id;
    String name;

    public Librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void searchBook(String name) {
        System.out.println("Searching for book: " + name);
    }

    boolean verifyMember(int id) {
        System.out.println("Verifying member with ID: " + id);
        return true;
    }

    void orderBooks() {
        System.out.println("Ordering books...");
    }

    void sellBooks() {
        System.out.println("Selling books...");
    }
}

class Publisher {
    int id;
    String name;
    String address;
    int phoneNo;

    public Publisher(int id, String name, String address, int phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    void addPub() {
        System.out.println("Adding publisher: " + name);
    }

    void modifyPub() {
        System.out.println("Modifying publisher details for: " + name);
    }

    void deletePub() {
        System.out.println("Deleting publisher: " + name);
    }

    void orderStatus() {
        System.out.println("Checking order status...");
    }
}

class User {
    int userId;
    String userName;
    String userAddress;
    int phoneNo;

    public User(int userId, String userName, String userAddress, int phoneNo) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNo = phoneNo;
    }

    void returnBook() {
        System.out.println("Returning book...");
    }

    void payFine(String date) {
        System.out.println("Paying fine on date: " + date);
    }

    void addNewUser() {
        System.out.println("Adding new user: " + userName);
    }

    void deleteUser() {
        System.out.println("Deleting user: " + userName);
    }

    void updateDetails() {
        System.out.println("Updating details for user: " + userName);
    }

    void bookPurchase() {
        System.out.println("Purchasing book...");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book = new Book(1, "Java Programming", "James Gosling", "1995", 500.0f, "Available");
        book.displayBookDetails();

        Librarian librarian = new Librarian(101, "Alice");
        librarian.searchBook("Java Programming");

        Publisher publisher = new Publisher(201, "TechBooks", "123 Library St", 987654321);
        publisher.addPub();

        User user = new User(301, "John Doe", "456 User Rd", 123456789);
        user.addNewUser();
    }
}


