import java.time.LocalDate;

public class BorrowTransaction {
    private int id;
    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private boolean returned;

    public BorrowTransaction(int id, Book book, Member member) {
        this.id = id;
        this.book = book;
        this.member = member;
        this.borrowDate = LocalDate.now();
        this.dueDate = borrowDate.plusDays(member.getBorrowDays());
        this.returned = false;
    }

    public int getId() { return id; }
    public Book getBook() { return book; }
    public Member getMember() { return member; }
    public LocalDate getDueDate() { return dueDate; }
    public boolean isReturned() { return returned; }
    public void markReturned() { returned = true; }

    public void printReceipt() {
        System.out.println("\\n--- BORROW RECEIPT ---");
        System.out.println("Transaction ID: " + id);
        System.out.println("Member: " + member.getName() + " (" + member.getType() + ")");
        System.out.println("Book: " + book.getTitle());
        System.out.println("Borrow date: " + borrowDate);
        System.out.println("Due date: " + dueDate);
    }
}
