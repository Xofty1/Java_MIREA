package newball;

import pract2.Author;

public class TestBall {
    public static void main(String[] args) {
        Ball RedBall = new Ball(14,45);
        RedBall.move(-3,6);
        System.out.println(RedBall.toString());
    }
}
