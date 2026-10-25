import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReturnTransaction {
    private int transactionId;
    private BorrowTransaction borrowTransaction;
    private LocalDate returnDate;
    private long lateDays;
    private double fine;

    public ReturnTransaction(int transactionId, BorrowTransaction borrowTransaction) {
        this.transactionId = transactionId;
        this.borrowTransaction = borrowTransaction;
        this.returnDate = LocalDate.now();
        this.lateDays = Math.max(0, ChronoUnit.DAYS.between(
                borrowTransaction.getDueDate(), returnDate));
        this.fine = lateDays * 5.0; // Fine: Rs. 5 per late day
    }

    public void printReceipt() {
        System.out.println("\\n--- RETURN RECEIPT ---");
        System.out.println("Return Transaction ID: " + transactionId);
        System.out.println("Book: " + borrowTransaction.getBook().getTitle());
        System.out.println("Member: " + borrowTransaction.getMember().getName());
        System.out.println("Return date: " + returnDate);
        System.out.println("Late days: " + lateDays);
        System.out.printf("Fine: Rs. %.2f%n", fine);
    }
}
