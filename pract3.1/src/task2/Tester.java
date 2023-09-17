package task2;

import java.rmi.ConnectIOException;

public class Tester {
    private Circle[] mas;
    private int len;

    public Tester(int len){
        this.len = len;
        this.mas = new Circle[len];
    }
    public static double minCir(Tester t)
    {
        double mn = t.mas[0].getR();
        for (int i = 1; i < t.len; i++) {
            if (mn > t.mas[i].getR())
                mn = t.mas[i].getR();
        }
        return mn;
    }

    public static double maxCir(Tester t)
    {
        double mx = t.mas[0].getR();
        for (int i = 1; i < t.len; i++) {
            if (mx < t.mas[i].getR())
                mx = t.mas[i].getR();
        }
        return mx;
    }

    public static void sortCir(Tester t) {
        Circle cir = new Circle();

        for (int i = 0; i < t.len-1; i++) {
            for (int j = i; j < t.len; j++) {
                if (t.mas[i].getR() < t.mas[j].getR()) {
                    cir = t.mas[i];
                    t.mas[i] = t.mas[j];
                    t.mas[j] = cir;
                }

            }
        }
    }



    public static void main(String[] args) {
        Circle cir = new Circle(Math.random(),Math.random(),Math.random());
        Tester t = new Tester(3);
        t.mas[0] = cir;
        Circle cir2 = new Circle(Math.random(),Math.random(),Math.random());
        t.mas[1] = cir2;
        Circle cir3 = new Circle(Math.random(),Math.random(),Math.random());
        t.mas[2] = cir3;
        System.out.println(t.mas[0].toString());
        System.out.println(t.mas[1].toString());
        System.out.println(t.mas[2].toString());
        System.out.println(maxCir(t));
        sortCir(t);
        System.out.println(t.mas[0].toString());
        System.out.println(t.mas[1].toString());
        System.out.println(t.mas[2].toString());
    }
}
