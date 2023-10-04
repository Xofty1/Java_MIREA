package task11;
import java.util.Scanner;
public class Answer11 {

    public int answer(Scanner scanner, int count)
    {
        int currentNumber = scanner.nextInt();
        if (currentNumber == 0) {
            int nextNumber = scanner.nextInt();
            if (nextNumber == 0) {
                return count;
            }
        }
        else{
            if (currentNumber == 1)
                count+=1;
        }
        return answer(scanner,count);

    }

    public static void main(String[] args) {
        Answer11 a = new Answer11();
        Scanner scanner = new Scanner(System.in);
        System.out.println(a.answer(scanner,0));
    }
}
