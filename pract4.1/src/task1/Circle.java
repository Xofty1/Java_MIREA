package task1;

public class Circle extends Shape{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public String getType() {
        return "Круг";
    }

    @Override
    public String toString() {
        return "Круг: Площадь круга = "+ getArea() + ". Длина окружности = " + getPerimetr();
    }

    @Override
    public double getArea() {
        return Math.PI * r*r;
    }

    @Override
    public double getPerimetr() {
        return  2 * r * Math.PI;
    }
}
