package task2;




public class Tester {
    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(0,0,10,10);
        MovablePoint bottomRight = new MovablePoint(10,-10,10,10);

        MovableRectangle rect = new MovableRectangle(topLeft,bottomRight);
        if (rect.checkPoint() == 0)
            rect.moveDown();
        System.out.println(rect.toString());


    }
}
