package task2;

public class Tester {
    public static void main(String[] args) {
        Phone ph1 = new Phone("899999","Apple",0.2);
        Phone ph2 = new Phone("896999","Samsung",0.15);
        Phone ph3 = new Phone("897999","Lenovo",0.19);
        System.out.println(ph1.toString());
        System.out.println(ph2.toString());
        System.out.println(ph3.toString());
        System.out.println(ph1.receiveCall("Друг"));
        System.out.println(ph1.receiveCall("Друг", "8994349"));
        ph2.sendMessage("89568","565745","4564563","36356546","4565464");
    }
}
