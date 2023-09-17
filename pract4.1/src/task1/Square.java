package task1;

public class Square extends Shape{
    private int a;
    private int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return a*b;
    }
    @Override
    public String toString() {
        return "Квадрат: Площадь квадрата = " + getArea() + ". Периметр квадрата = " + getPerimetr();
    }
    @Override
    public double getPerimetr() {
        return (a+b)*2;
    }
}
