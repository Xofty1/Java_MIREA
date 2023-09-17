package task3;



public class Tester {
    public static void main(String[] args) {
        Person Artem = new Person();
        Person Roman = new Person("Roman", 19);
        Artem.setAge(18);
        Artem.setFullName("Artem");
        Artem.talk();
        Roman.move();
        System.out.println(Artem.toString());
        System.out.println(Roman.toString());
    }
}
