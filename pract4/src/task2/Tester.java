package task2;

public class Tester {
    public static void main(String[] args) {
        Atelier a = new Atelier();
        TShirt th =new TShirt();
        Tie t = new Tie();
        Pants p = new Pants();
        a.clothes[0] = th;
        a.clothes[1] = t;
        a.clothes[2] = p;
        a.dressMan();
        a.dressWoman();
    }

}
