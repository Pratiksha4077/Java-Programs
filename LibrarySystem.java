import LibraryManagement.Book;
import LibraryManagement.Member;

public class LibrarySystem 
{
	public static void main(String[] args) 
	{

        	Book book1 = new Book("The Alchemist", "Paulo Coelho", "12345");
        	Member member1 = new Member("Alice", 101);

        	member1.displayInfo();

        	book1.issueBook();
        	book1.returnBook();
        	book1.returnBook();  
    }
}
