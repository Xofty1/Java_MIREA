package newBook;

import java.sql.SQLOutput;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Chehov", "Hamilion", 1936);
        Book book2 = new Book("Chehov2", "Hamilion2", 1931);
        Book book3= new Book("Chehov4", "Hamilion4", 1933);
        Bookshelf books = new Bookshelf(3);
        books.setBooks(0,book);
        books.addBooks(3);

        books.sortBookshelf();
        System.out.println(books.toString());
        System.out.println(books.toString());

        }
    }

