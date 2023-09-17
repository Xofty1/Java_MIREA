package task5;

import task1.Rectangle;

public class Tester {
    public static void main(String[] args) {
        Reader r = new Reader("Vasya", 12,"FFFF-1", "23.03.03","8943253285");
        Book b1 = new Book("R");
        Book b2 = new Book("A");
        Book b3 = new Book("S");
        Book b4 = new Book("F");
        r.takeBook(b1,b2,b3,b4);
        r.returnBook(b1,b2,b4);
    }
}
