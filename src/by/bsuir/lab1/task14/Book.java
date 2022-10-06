package by.bsuir.lab1.task14;

public class Book implements Comparable<Book> {
    private final String title;
    private final String author;
    private final int price;
    private static int edition;
    private final int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Book book) {
            return this.title.equals(book.title) && this.author.equals(book.author);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return price * 14 + author.hashCode() * 15 + title.hashCode() + 798;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice:" + price;
    }

    @Override
    public Object clone() {
        return new Book(this.title, this.author, this.price, this.isbn);
    }

    @Override
    public int compareTo(Book o) {
        return isbn - o.getIsbn();
    }
}
