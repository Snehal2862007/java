package ex5;

public class Member {

    int memberId;
    String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public void displayMember() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + memberName);
    }
}