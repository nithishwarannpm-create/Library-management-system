public class Member {
    private int id;
    private String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public int getBorrowLimit() { return 2; }
    public int getBorrowDays() { return 14; }

    public String getType() { return "Regular"; }

    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Type: " + getType();
    }
}
