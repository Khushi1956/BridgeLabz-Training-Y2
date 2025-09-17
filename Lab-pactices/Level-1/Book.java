class Book {
    private static String libraryName = "City Library";
    private String title, author;
    private final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title; this.author = author; this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book)
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James", "12345");
        Book.displayLibraryName();
        b1.displayDetails();
    }
}
