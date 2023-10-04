package task4;
import java.lang.Math;
public interface MathCalculable {
    public static double powMy(double x,double y ){
        return Math.pow(x,y);
    }
    public static double abs(double a, double b){
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
    public double getPi();

}
