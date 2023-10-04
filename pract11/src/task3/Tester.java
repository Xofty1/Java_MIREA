package task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tester {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormatter = new
                SimpleDateFormat("dd-MM-yyyy");
        Date bDate = dateFormatter.parse("18-12-2009");

        Student student = new Student(bDate,"Roman");
        student.toString(1);
        student.toString(2);
        student.toString(3);
    }
}
