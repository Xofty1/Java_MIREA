package task2;

public class Circle {

    private Point point;
    private double r;

    public Circle (double x, double y, double r)
    {
        this.point = new Point(x,y);
        this.r = r;
    }
    public Circle (){}
    public double getR() {
        return r;
    }

    public String toString()
    {
        return "Circle: x = " + point.getX()  + ", y = " + point.getY() + ", r = " + r;
    }
}
