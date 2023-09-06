package task6;
import java.lang.Math;
public class Circle {
    private double r;
    private double x;
    private double y;

    public Circle(double r, double x, double y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void changeParametrs(double deltaX, double deltaY, double deltaR)
    {
        this.r += deltaR;
        this.x += deltaX;
        this.y += deltaY;
    }

    public double sq()
    {
        return Math.PI * this.r*this.r;
    }

    public double lenCircle()
    {
        return 2 * Math.PI * this.r;
    }

    public void compairCircle(Circle cir)
    {
        if (this.r > cir.r)
        {
            System.out.println("Радиус, площадь круга и длина окружности первой окружности больше чем у второй");
        }
        else
            System.out.println("Радиус, площадь круга и длина окружности второй окружности больше чем у первой");
    }
}
