package task3;

public class Person {
    private String fullName;
    private  int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void move()
    {
        System.out.println(this.getFullName() + " двигается");
    }
    public  void talk() {
        System.out.println(this.getFullName() + " говорит");
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person:" +
                "fullName='" + fullName + '\'' +
                ", age=" + age ;
    }
}
