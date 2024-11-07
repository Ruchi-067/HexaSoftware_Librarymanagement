
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    private List<Book> books;
    private HashMap<String, Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new HashMap<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Book added: " + title + " by " + author);
    }

    public void addMember(String name, String memberId) {
        Member member = new Member(name, memberId);
        members.put(memberId, member);
        System.out.println("Member added: " + name + " (ID: " + memberId + ")");
    }

    public void issueBook(String title, String memberId) {
        Book bookToIssue = findBook(title);
        Member member = members.get(memberId);

        if (bookToIssue == null) {
            System.out.println("Book not found.");
            return;
        }

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (bookToIssue.isIssued()) {
            System.out.println("Book is already issued to " + bookToIssue.getIssuedTo().getName());
        } else {
            bookToIssue.issueBook(member);
            System.out.println("Book issued: " + title + " to " + member.getName());
        }
    }

    public void returnBook(String title) {
        Book bookToReturn = findBook(title);

        if (bookToReturn == null) {
            System.out.println("Book not found.");
            return;
        }

        if (bookToReturn.isIssued()) {
            System.out.println("Book returned: " + title + " from " + bookToReturn.getIssuedTo().getName());
            bookToReturn.returnBook();
        } else {
            System.out.println("Book is not currently issued.");
        }
    }

    private Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayIssuedBooks() {
        System.out.println("Issued books:");
        for (Book book : books) {
            if (book.isIssued()) {
                System.out.println(book.getTitle() + " issued to " + book.getIssuedTo().getName());
            }
        }
    }
}

