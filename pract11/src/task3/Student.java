package task3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Student {
    Date bDate;
    String name;

    public Student(Date bDate, String name) {
        this.bDate = bDate;
        this.name = name;
    }

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void toString(int l)
    {
        switch (l){
            case 1:
                brief();
                break;
            case 2:
                lon();
                break;
            case 3:
                longer();
                break;

        }
    }

    public void brief()
    {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("y-M-d");
        System.out.println(dateFormatter.format(this.bDate));
    }

    public void lon()
    {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E yyyy-MM-dd  ");
        System.out.println(dateFormatter.format(this.bDate));
    }

    public void longer()
    {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E yyyy-MMMM-dd  ");
        System.out.println(dateFormatter.format(this.bDate));
    }
}
