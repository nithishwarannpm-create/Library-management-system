# Library Management System

## 1. Problem Statement

Develop a **Library Management System using Java and Object-Oriented Programming (OOP)** to manage books, authors, library members, and borrowing and returning transactions.

The system must ensure that books can only be borrowed when copies are available. It should update book stock whenever a book is borrowed or returned, provide additional borrowing privileges to premium members, calculate fines for late returns, and maintain a direct relationship between transactions and books.

The application should provide a menu-driven interface for performing library operations and display borrowing receipts, return receipts, updated stock quantities, and applicable fines.

## 2. Project Overview

The Library Management System is a console-based Java application designed to simplify basic library operations.

It allows the librarian to add books, register members, issue books, process returns, monitor available copies, and calculate late-return fines.

The project demonstrates object-oriented programming concepts through separate classes for books, authors, members, transactions, and library management.

## 3. Objectives

- Manage book and author information.
- Register regular and premium members.
- Allow members to borrow available books.
- Process book returns and update stock.
- Provide higher borrowing limits and longer borrowing periods for premium members.
- Calculate fines for late returns.
- Maintain borrowing and returning transaction records.
- Display available books and transaction receipts.

## 4. Technologies Used

- **Programming Language:** Java
- **Programming Paradigm:** Object-Oriented Programming
- **Interface:** Command-Line Interface (CLI)
- **Data Storage:** In-memory collections, if implemented in the submitted code.

## 5. Class Requirements

The application is designed around the following classes:

| Class | Responsibility |
|---|---|
| `Book` | Stores book details and manages stock information. |
| `Author` | Stores author information. |
| `Member` | Represents a regular library member. |
| `PremiumMember` | Represents a premium member with additional borrowing privileges. |
| `BorrowTransaction` | Records book-borrowing details. |
| `ReturnTransaction` | Records book-return details and applicable fines. |
| `Library` | Manages books, members, and library operations. |

## 6. Functional Requirements

### 6.1 Add Book
Allows the librarian to add a book using its ID, title, author, and stock quantity.

### 6.2 Add Member
Allows the librarian to register regular and premium members.

### 6.3 Borrow Book
Allows a registered member to borrow a book if copies are available. The system decreases the available stock and generates a borrowing receipt.

### 6.4 Return Book
Allows a member to return a borrowed book. The system updates the stock and calculates a fine when the book is returned after its due date.

### 6.5 Display Available Books
Displays the books currently available for borrowing, including their details and available stock.

### 6.6 Exit
Terminates the application.

## 7. Business Rules

1. A book can be borrowed only if at least one copy is available.
2. Borrowing a book decreases its available stock by one.
3. Returning a book increases its available stock by one.
4. Premium members can borrow more books and keep them for a longer duration than regular members.
5. Fines are applied for late returns according to the implemented fine policy.
6. Borrowing and returning transactions must be directly associated with the relevant books.
7. A member must not exceed their permitted borrowing limit.

## 8. Menu Options

The application provides the following menu:

```text
========== LIBRARY MANAGEMENT SYSTEM ==========

1. Add Book
2. Add Member
3. Borrow Book
4. Return Book
5. Display Available Books
6. Exit

Enter your choice:
```

## 9. Sample Book Details

The following books can be used to test the application.

| Book ID | Book Title | Author | Stock |
|---|---|---|---:|
| 101 | Java Programming | James Gosling | 10 |
| 102 | Clean Code | Robert C. Martin | 5 |
| 103 | The C++ Programming Language | Bjarne Stroustrup | 7 |
| 104 | The C Programming Language | Brian W. Kernighan and Dennis M. Ritchie | 6 |

## 10. Sample Workflow

1. Start the application.
2. Add books to the library.
3. Register a regular or premium member.
4. Borrow an available book.
5. Verify the borrowing receipt and reduced stock.
6. Return the borrowed book.
7. Verify the return receipt, updated stock, and any applicable fine.
8. Display available books.
9. Exit the application.

## 11. Expected Output

The application is expected to provide:

- Confirmation when a book or member is added successfully.
- Borrowing receipts containing relevant transaction details.
- Return receipts containing return details and applicable fines.
- Updated stock quantities after borrowing and returning.
- A list of available books.
- Appropriate messages when books are unavailable or borrowing rules are violated.

## 12. How to Compile and Run

### Prerequisites

Install the Java Development Kit (JDK).

Verify the installation:

```bash
java -version
javac -version
```

### Compile the Source Files

Open a terminal in the project directory and run:

```bash
javac *.java
```

### Run the Application

```bash
java Main
```

**Note:** The main class name and commands must match the actual source files in your project.

## 13. Object-Oriented Programming Concepts

The project demonstrates the following OOP concepts:

- **Classes and Objects:** Represent books, authors, members, and transactions.
- **Encapsulation:** Organize data and operations within classes.
- **Inheritance:** Extend the `Member` class to create `PremiumMember`.
- **Abstraction:** Separate library operations from their implementation details.
- **Association:** Connect borrowing and returning transactions to books and members.

## 14. Limitations

- If the application uses only in-memory collections, its data will be lost when it terminates.
- The application does not provide a graphical user interface.
- Permanent data storage requires a database or file-storage implementation.

## 15. Future Enhancements

- Integrate a database for permanent storage.
- Add book searching by title, author, or ID.
- Maintain a complete borrowing history for each member.
- Generate library reports.
- Introduce a graphical user interface.
- Add stronger input validation and error handling.

## 16. Conclusion

The Library Management System provides a simple way to manage books, members, borrowing, and returning operations using Java. It applies object-oriented programming concepts to organize the application and implements essential library business rules, including stock management, member borrowing limits, and late-return fines.

This project serves as a practical demonstration of Java programming and object-oriented software development.
