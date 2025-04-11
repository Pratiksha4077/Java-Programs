package LibraryManagement;

public class Member {
    String name;
    int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayInfo() {
        System.out.println("Member: " + name + ", ID: " + memberId);
    }
}
