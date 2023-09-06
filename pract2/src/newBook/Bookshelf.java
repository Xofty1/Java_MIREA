package newBook;
import newDog.Dog;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    private Book[] books;
    private int amount;

    public Bookshelf(int amount) {
        this.books = new Book[amount];
        this.amount = amount;
    }

    public void setBooks(int i, Book book) {
        this.books[i] = book;
    }

    public Book minYear(Book[] books)
    {
        Book minYearBook = new Book(2024);

        for (int i = 0; i < this.amount; i++) {
            if (books[i].getYear() < minYearBook.getYear())
            {
                minYearBook.setYear(books[i].getYear());
                minYearBook.setName(books[i].getName());
                minYearBook.setAuthor(books[i].getAuthor());
            }
        }
        return minYearBook;
    }

    public Book maxYear(Book[] books)
    {
        Book maxYearBook = new Book(2024);

        for (int i = 0; i < this.amount; i++) {
            if (books[i].getYear() > maxYearBook.getYear())
            {
                maxYearBook.setYear(books[i].getYear());
                maxYearBook.setName(books[i].getName());
                maxYearBook.setAuthor(books[i].getAuthor());
            }
        }
        return maxYearBook;
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "books=" + this.books[1].getYear() +
                ", amount=" + amount +
                '}';
    }
    public void addBooks(int mx) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mx; i++) {
            String author = sc.nextLine();
//            sc.nextLine();
            String name = sc.nextLine();
            int year = sc.nextInt();
            sc.nextLine();
            Book book = new Book(author,name,year);

            this.books[i] = book;
            System.out.println("Книга была поставлена на полку");
        }
    }

    public void sortBookshelf()
    {
        double factor = 1.247; // Фактор уменьшения
        double step = this.amount - 1;

        while (step >= 1) {
            for (int i = 0; i + step < this.amount; ++i) {
                if (books[i].getYear() > books[i + (int) step].getYear()) {
//                    swapBooks(books[i], books[i + (int) step]);
                    Book book = books[i];
                    books[i] = books[i + (int) step];
                    books[i + (int) step] = book;
                }
            }
            step /= factor;
        }
        // сортировка пузырьком
        for (int idx_i = 0; idx_i + 1 < this.amount; ++idx_i) {
            for (int idx_j = 0; idx_j + 1 < this.amount - idx_i; ++idx_j) {
                if (books[idx_j + 1].getYear() < books[idx_j].getYear()) {
                    Book book = books[idx_j];
                    books[idx_j] = books[idx_j + 1];
                    books[idx_j + 1] = book;
                }
            }
        }
    }
}
