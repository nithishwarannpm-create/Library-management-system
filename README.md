# Library Management System

## 📌 Project Overview

The **Library Management System** is a simple Java console-based application developed using Object-Oriented Programming (OOP) concepts. It helps manage books, library members, borrowing, and returning operations.

The system tracks book availability, updates stock, generates transaction receipts, and calculates fines for late returns.

## 🎯 Objectives

- Add and manage books.
- Register regular and premium members.
- Borrow and return books.
- Track available book copies.
- Calculate fines for late returns.
- Display available books.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Concepts:** Classes, Objects, Inheritance, Encapsulation, Collections, and Exception Handling
- **Interface:** Console-based menu

## 📂 Project Structure

```text
LibraryManagementSystem/
│
├── Main.java
├── Book.java
├── Author.java
├── Member.java
├── PremiumMember.java
├── BorrowTransaction.java
├── ReturnTransaction.java
└── Library.java
```

## ✨ Features

1. **Add Book:** Add books with an ID, title, author, and stock quantity.
2. **Add Member:** Register regular and premium library members.
3. **Borrow Book:** Borrow a book if copies are available.
4. **Return Book:** Return borrowed books and update stock.
5. **Premium Membership:** Allow premium members additional borrowing privileges.
6. **Late Fine Calculation:** Calculate fines for overdue returns.
7. **Available Books:** Display books that are available for borrowing.
8. **Transaction Receipts:** Display borrowing and return details.

## ⚙️ Business Rules

- A book can be borrowed only when copies are available.
- Borrowing a book decreases its available stock by one.
- Returning a book increases its available stock by one.
- Premium members have higher borrowing limits and longer borrowing periods.
- Late returns may incur a fine.
- Borrowing and returning transactions are associated with the relevant book.

## ▶️ How to Run

### Prerequisites

Install the **Java Development Kit (JDK)** and make sure the `java` and `javac` commands are available in your terminal.

Check the installation:

```bash
java -version
javac -version
```

### Step 1: Open the Project Folder

Open a terminal in the folder containing the Java source files.

### Step 2: Compile the Program

```bash
javac *.java
```

### Step 3: Run the Application

```bash
java Main
```

## 🖥️ Menu Options

The application provides the following menu options:

1. Add Book
2. Add Member
3. Borrow Book
4. Return Book
5. Display Available Books
6. Exit

Follow the console prompts to select an operation and enter the required details.

## 🧪 Sample Workflow

1. Add a book with its ID, title, author, and stock quantity.
2. Register a regular or premium member.
3. Select **Borrow Book** and enter the member ID and book ID.
4. Check the borrowing receipt and updated stock.
5. Select **Return Book** and enter the required details.
6. Check the return receipt, any applicable fine, and the updated stock.
7. Select **Display Available Books** to view available copies.

## 💾 Data Storage

This version is intended as a simple console-based assignment. If the implementation uses in-memory collections, the records are available only while the program is running. Data will not persist after the application closes unless file storage or a database is added.

## 🚀 Future Enhancements

- Store records permanently using a database.
- Add book search functionality.
- Maintain a complete borrowing history.
- Generate detailed library reports.
- Add a graphical user interface.
- Improve input validation and error handling.

## 👨‍💻 Author

**Nithishwaran R.**

## 📄 License

This project was created for educational and academic purposes.