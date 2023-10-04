package task4;
import java.lang.Math;
public class MathFunc implements MathCalculable{
    private double x;
    private double y;

    public MathFunc(double x, double y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public double getPi() {
        return Math.PI;
    }

    public static void main(String[] args) {
        MathFunc m = new MathFunc(5,6);
        System.out.println(MathCalculable.powMy(m.x,m.y));
        System.out.println(m.getPi());
        System.out.println(MathCalculable.abs(m.x,m.y));

    }
}
