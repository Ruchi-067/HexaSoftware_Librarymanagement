
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("To Kill a Mockingbird", "Harper Lee");

        // Adding members
        library.addMember("Alice", "M001");
        library.addMember("Bob", "M002");

        // Issuing a book
        library.issueBook("The Great Gatsby", "M001");

        // Trying to issue the same book to another member
        library.issueBook("The Great Gatsby", "M002");

        // Returning the book
        library.returnBook("The Great Gatsby");

        // Displaying all issued books
        library.displayIssuedBooks();
    }
}
