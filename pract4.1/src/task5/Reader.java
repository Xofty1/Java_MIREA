package task5;

import java.util.Objects;

public class Reader {
    private String name;
    private int num;
    private String faculty;
    private String birthData;
    private String phoneNum;

    public Reader(String name, int num, String faculty, String birthData, String phoneNum) {
        this.name = name;
        this.num = num;
        this.faculty = faculty;
        this.birthData = birthData;
        this.phoneNum = phoneNum;
    }

    public void takeBook(Book... books)
    {
        System.out.print(this.getName() + " взял книги: ");
        Book lastBook = null;
        for (Book book : books) {
            lastBook = book;
        }
        for (Book book : books) {
            System.out.print(book.getName());
            if (!Objects.equals(book.getName(), lastBook.getName()))
                System.out.print(", ");
            else
                System.out.println(".");
        }
    }


    public void returnBook(Book... books)
    {
        System.out.print(this.getName() + " вернул книги: ");
        Book lastBook = null;
        for (Book book : books) {
            lastBook = book;
        }
        for (Book book : books) {
            System.out.print(book.getName());
            if (!Objects.equals(book.getName(), lastBook.getName()))
                System.out.print(", ");
            else
                System.out.println(".");
        }
    }

    public String getName() {
        return name;
    }
}
