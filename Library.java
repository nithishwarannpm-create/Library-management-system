import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<BorrowTransaction> transactions = new ArrayList<>();
    private int nextTransactionId = 1;

    public boolean addBook(Book book) {
        if (findBook(book.getId()) != null) return false;
        books.add(book);
        return true;
    }

    public boolean addMember(Member member) {
        if (findMember(member.getId()) != null) return false;
        members.add(member);
        return true;
    }

    public Book findBook(int id) {
        for (Book book : books)
            if (book.getId() == id) return book;
        return null;
    }

    public Member findMember(int id) {
        for (Member member : members)
            if (member.getId() == id) return member;
        return null;
    }

    public void borrowBook(int bookId, int memberId) {
        Book book = findBook(bookId);
        Member member = findMember(memberId);

        if (book == null) {
            System.out.println("Book ID not found.");
            return;
        }
        if (member == null) {
            System.out.println("Member ID not found.");
            return;
        }
        if (book.getAvailableCopies() == 0) {
            System.out.println("No copies available.");
            return;
        }

        int activeCount = 0;
        for (BorrowTransaction t : transactions)
            if (t.getMember().getId() == memberId && !t.isReturned())
                activeCount++;

        if (activeCount >= member.getBorrowLimit()) {
            System.out.println(member.getType() + " member borrow limit reached.");
            return;
        }

        book.borrowCopy();
        BorrowTransaction transaction =
                new BorrowTransaction(nextTransactionId++, book, member);
        transactions.add(transaction);
        transaction.printReceipt();
        System.out.println("Available copies now: " + book.getAvailableCopies());
    }

    public void returnBook(int bookId, int memberId) {
        for (BorrowTransaction t : transactions) {
            if (t.getBook().getId() == bookId
                    && t.getMember().getId() == memberId
                    && !t.isReturned()) {
                t.markReturned();
                t.getBook().returnCopy();
                ReturnTransaction rt = new ReturnTransaction(nextTransactionId++, t);
                rt.printReceipt();
                System.out.println("Available copies now: "
                        + t.getBook().getAvailableCopies());
                return;
            }
        }
        System.out.println("No active borrow record found for this book and member.");
    }

    public void displayAvailableBooks() {
        System.out.println("\\n--- AVAILABLE BOOKS ---");
        boolean found = false;
        for (Book book : books) {
            if (book.getAvailableCopies() > 0) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) System.out.println("No books currently available.");
    }

    public void displayAllBooks() {
        System.out.println("\\n--- ALL BOOKS / STOCK ---");
        if (books.isEmpty()) {
            System.out.println("No books registered.");
            return;
        }
        for (Book book : books) System.out.println(book);
    }

    public void displayMembers() {
        System.out.println("\\n--- MEMBERS ---");
        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }
        for (Member member : members) System.out.println(member);
    }
}
