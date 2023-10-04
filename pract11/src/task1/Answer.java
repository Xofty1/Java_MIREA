package task1;
import java.util.Date;

public class Answer {
    public static void main(String[] args) {

        String[] names = {"Chehov","Smirnov", "Vasilev", "Pushkin", "Petrov"};

        for (int i = 0; i < 5; i++) {
            Date date = new Date();
            System.out.println(names[i] + " время: " + date.toString());
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}