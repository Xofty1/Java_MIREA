package task2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Answer {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        SimpleDateFormat dateFormatter = new
                SimpleDateFormat("dd-MM-yyyy");
        Date userDate = dateFormatter.parse(date);
        Date currentDate = new Date();
        if (currentDate.before(userDate)) {
            System.out.println("Введенная дата и время находятся в будущем.");
        } else if (currentDate.after(userDate)) {
            System.out.println("Введенная дата и время находятся в прошлом.");
        } else {
            System.out.println("Введенная дата и время совпадают с текущим системным временем.");
        }
    }
}
