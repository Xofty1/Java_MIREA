package task1;

public class Student {
    private String name;
    private String second_name;
    private String profile;
    private int course;
    private int group;
    private double average;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Student(int course, int group, double average) {
        this.course = course;
        this.group = group;
        this.average = average;
    }

    public Student() {
    }

    public String toStr() {
        return "Student: course = " + this.getCourse() + " group = " + this.getGroup() + " average marks = " + this.getAverage();
    }
}
