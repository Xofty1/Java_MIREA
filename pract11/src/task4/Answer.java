package task4;

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
                SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date userDate = dateFormatter.parse(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(userDate);
        System.out.println(dateFormatter.format(calendar.getTime()));
        System.out.println(dateFormatter.format(userDate));
    }
}
