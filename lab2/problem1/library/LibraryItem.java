package lab2.problem1.library;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }

    @Override
    public String toString() {
        return String.format("%s: %s by %s (%d)", 
            this.getClass().getSimpleName(), title, author, publicationYear);
    }
}
