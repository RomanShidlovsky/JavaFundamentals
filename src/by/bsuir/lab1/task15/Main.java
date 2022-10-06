package by.bsuir.lab1.task15;

import by.bsuir.lab1.task12.Book;
import by.bsuir.lab1.task15.comparators.ComparatorByAuthorAndName;
import by.bsuir.lab1.task15.comparators.ComparatorByAuthorNamePrice;
import by.bsuir.lab1.task15.comparators.ComparatorByName;
import by.bsuir.lab1.task15.comparators.ComparatorByNameAndAuthor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Book> comparatorByName = new ComparatorByName();
        Comparator<Book> comparatorByNameAndAuthor = new ComparatorByNameAndAuthor();
        Comparator<Book> comparatorByAuthorAndName = new ComparatorByAuthorAndName();
        Comparator<Book> comparatorByAuthorNamePrice = new ComparatorByAuthorNamePrice();

        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("A", "B", 100));
        list.add(new Book("B", "B", 120));
        list.add(new Book("AB", "A", 50));
        list.add(new Book("C", "C", 130));
        list.add(new Book("BAC", "C", 89));

        list.sort(comparatorByName);
        System.out.println(Arrays.toString(list.toArray()));
        list.sort(comparatorByNameAndAuthor);
        System.out.println(Arrays.toString(list.toArray()));
        list.sort(comparatorByAuthorAndName);
        System.out.println(Arrays.toString(list.toArray()));
        list.sort(comparatorByAuthorNamePrice);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
