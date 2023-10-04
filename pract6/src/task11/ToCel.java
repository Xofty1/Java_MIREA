package task11;

public class ToCel implements Convertable{
    private int c;

    public ToCel(int c) {
        this.c = c;
    }

    @Override
    public double convert() {
        return c + 273.15;
    }
}
