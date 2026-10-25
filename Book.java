public class Book {
    private int id;
    private String title;
    private Author author;
    private int totalCopies;
    private int availableCopies;

    public Book(int id, String title, Author author, int copies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalCopies = copies;
        this.availableCopies = copies;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public Author getAuthor() { return author; }
    public int getTotalCopies() { return totalCopies; }
    public int getAvailableCopies() { return availableCopies; }

    public boolean borrowCopy() {
        if (availableCopies <= 0) return false;
        availableCopies--;
        return true;
    }

    public void returnCopy() {
        if (availableCopies < totalCopies) availableCopies++;
    }

    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: "
                + author.getName() + " | Available: " + availableCopies
                + "/" + totalCopies;
    }
}
