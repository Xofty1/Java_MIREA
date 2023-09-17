package task1;

public class Rectangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Rectangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getType() {
        return "Треугольник";
    }

    @Override
    public double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)) ;
    }
    @Override
    public String toString() {
        return "Треугольник: Площадь треугольника = "+ getArea() + ". Периметр треугольника = " + getPerimetr();
    }
    @Override
    public double getPerimetr() {
        return  a+b+c;
    }
}
