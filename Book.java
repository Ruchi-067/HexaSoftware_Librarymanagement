public class Book {
    private String title;
    private String author;
    private boolean isIssued;
    private Member issuedTo;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public Member getIssuedTo() {
        return issuedTo;
    }

    public void issueBook(Member member) {
        this.isIssued = true;
        this.issuedTo = member;
    }

    public void returnBook() {
        this.isIssued = false;
        this.issuedTo = null;
    }
}
