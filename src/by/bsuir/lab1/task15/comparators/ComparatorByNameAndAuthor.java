package by.bsuir.lab1.task15.comparators;

import by.bsuir.lab1.task12.Book;
import java.util.Comparator;

public class ComparatorByNameAndAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getTitle().compareTo(o2.getTitle());
        if (result == 0) {
            result = o1.getAuthor().compareTo(o2.getAuthor());
        }
        return result;
    }
}
