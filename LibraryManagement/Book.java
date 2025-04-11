package LibraryManagement;

public class Book {
    String title, author, ISBN;
    boolean isIssued = false;


    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " issued successfully.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " returned successfully.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }
}
