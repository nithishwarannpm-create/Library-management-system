import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Available Books");
            System.out.println("6. Display All Books and Stock");
            System.out.println("7. Display Members");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter book ID: ");
                        int bookId = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Enter book title: ");
                        String title = sc.nextLine().trim();
                        System.out.print("Enter author name: ");
                        String authorName = sc.nextLine().trim();
                        System.out.print("Enter number of copies: ");
                        int copies = Integer.parseInt(sc.nextLine().trim());

                        if (title.isEmpty() || authorName.isEmpty() || copies <= 0) {
                            System.out.println("Title/author cannot be empty and copies must be positive.");
                            break;
                        }
                        Book book = new Book(bookId, title, new Author(authorName), copies);
                        if (library.addBook(book))
                            System.out.println("Book added successfully.");
                        else
                            System.out.println("Book ID already exists.");
                    } catch (NumberFormatException e) {
                        System.out.println("Book ID and copies must be numbers.");
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter member ID: ");
                        int memberId = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Enter member name: ");
                        String name = sc.nextLine().trim();
                        if (name.isEmpty()) {
                            System.out.println("Name cannot be empty.");
                            break;
                        }
                        System.out.print("Member type (1-Regular, 2-Premium): ");
                        int type = Integer.parseInt(sc.nextLine().trim());
                        Member member;
                        if (type == 1) member = new Member(memberId, name);
                        else if (type == 2) member = new PremiumMember(memberId, name);
                        else {
                            System.out.println("Invalid member type.");
                            break;
                        }
                        if (library.addMember(member))
                            System.out.println("Member registered successfully.");
                        else
                            System.out.println("Member ID already exists.");
                    } catch (NumberFormatException e) {
                        System.out.println("Member ID and type must be numbers.");
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Enter book ID: ");
                        int bookId = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Enter member ID: ");
                        int memberId = Integer.parseInt(sc.nextLine().trim());
                        library.borrowBook(bookId, memberId);
                    } catch (NumberFormatException e) {
                        System.out.println("IDs must be numbers.");
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Enter book ID: ");
                        int bookId = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Enter member ID: ");
                        int memberId = Integer.parseInt(sc.nextLine().trim());
                        library.returnBook(bookId, memberId);
                    } catch (NumberFormatException e) {
                        System.out.println("IDs must be numbers.");
                    }
                    break;

                case 5:
                    library.displayAvailableBooks();
                    break;

                case 6:
                    library.displayAllBooks();
                    break;

                case 7:
                    library.displayMembers();
                    break;

                case 8:
                    System.out.println("Thank you for using the Library Management System.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select 1-8.");
            }
        }
    }
}
