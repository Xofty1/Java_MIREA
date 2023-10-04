package task11;

public class ToFar implements Convertable{
    private int c;
    @Override
    public double convert() {

        return (c * 1.8)+32;
    }
}
