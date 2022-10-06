package by.bsuir.lab1.task13;

import by.bsuir.lab1.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn) {
        super(title, author, price);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ProgrammerBook book) {
            if (!super.equals(object)) return false;
            return book.language.equals(this.language) && book.level == this.level;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + language.hashCode() + level * 321;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLanguage: " + language + "\nLevel: " + level;
    }
}
