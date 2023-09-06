package newCircle;

public class Tester {
    private Circle[] mas;
    private int len;

    public Tester(int len){
        this.len = len;
        this.mas = new Circle[len];
    }

    public static void main(String[] args) {
        Circle cir = new Circle(5,5,7);
        Tester t = new Tester(2);
        t.mas[0] = cir;
        Circle cir2 = new Circle(50,25,71);
        t.mas[1] = cir2;
        System.out.println(t.mas[0].toString());
        System.out.println(t.mas[1].toString());
    }
}
