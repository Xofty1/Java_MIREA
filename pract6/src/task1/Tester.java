package task1;

public class Tester {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0,0,10,10);
        point.moveDown();
        System.out.println(point.toString());

        MovableCircle cir = new MovableCircle(7,point);
        cir.moveLeft();
        System.out.println(cir.toString());
    }
}
