package task1;

public class Student {
    private int id;
    private String Name;

    public Student(int id, String name) {
        this.id = id;
        Name = name;
    }

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public String toStr() {
        return "Student: id = " + this.getId();
    }

}
