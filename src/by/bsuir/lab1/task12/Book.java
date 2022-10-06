package by.bsuir.lab1.task12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
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

    @Override
    public boolean equals(Object object) {
        if (object instanceof Book book){
            return this.title.equals(book.title) && this.author.equals(book.author);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return price * 14 + author.hashCode() * 15 + title.hashCode() +798;
    }

    @Override
    public String toString() {
        return "Title: " + title +"\nAuthor: " + author + "\nPrice:" + price;
    }
}
