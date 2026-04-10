import ex5.Book;
import ex5.Member;

public class LibrarySystem {

    public static void main(String[] args) {

        // Creating Book object
        Book b1 = new Book("Java Programming", "James Gosling", "12345");

        // Creating Member object
        Member m1 = new Member(101, "Snehal");

        System.out.println("----- Book Details -----");
        b1.displayBook();

        System.out.println("\n----- Member Details -----");
        m1.displayMember();
    }
}