package task3;

public class Student {
    int id;
    int mark;

    public Student(int id, int mark) {
        this.id = id;
        this.mark = mark;
    }
    public String toStr() {
        return "Student: id = " + this.getId() + " mark: " + this.getMark();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student() {
    }
}
