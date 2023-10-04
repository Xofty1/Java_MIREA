package task12;

import java.util.Scanner;

public class Answer12 {
    public void answer(Scanner scanner)
    {
        int current = scanner.nextInt();
        if (current != 0)
        {
            if (current%2==1)
            {
                System.out.println(current);
            }
            answer(scanner);
        }
    }

    public static void main(String[] args) {
        Answer12 a = new Answer12();
        Scanner sc = new Scanner(System.in);
        a.answer(sc);
    }
}
