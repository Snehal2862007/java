import LibraryManagement.book;
import LibraryManagement.member;

public class LibrarySystem {
    public static void main(String[] args) {

        book book = new book("Java Programming", "James Gosling", "12345");
        member member = new member("Snehal", 101);

        System.out.println("---- Book Details ----");
        book.displayBook();

        System.out.println("\n---- Member Details ----");
        member.displayMember();
    }
}