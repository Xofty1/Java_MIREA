package task2;

public class Student {
    int marks;
    String Name;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String toStr() {
        return "Student: id = " + this.getMarks();
    }
    public Student(int marks) {
        this.marks = marks;
    }
}
