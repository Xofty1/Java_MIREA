package task2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Roman");
        Person p2 = new Person("Oleg", "Groshov", "Romanovic");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
