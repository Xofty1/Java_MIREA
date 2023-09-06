package task6;

public class CircleTest {
    public static void main(String[] args) {
        Circle cir1 = new Circle(6,25,25);
        Circle cir2 = new Circle(7,25,25);
        System.out.println("Длина окружности = " + cir1.lenCircle());
        System.out.println("Длина окружности = " + cir1.sq());
        cir1.compairCircle(cir2);
    }
}
