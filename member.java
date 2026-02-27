package LibraryManagement;

public class member {
    private String name;
    private int memberId;

    public member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayMember() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}