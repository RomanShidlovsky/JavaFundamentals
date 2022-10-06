package by.bsuir.lab1.task15.comparators;

import by.bsuir.lab1.task12.Book;
import java.util.Comparator;

public class ComparatorByName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
