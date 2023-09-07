package poker;
import java.util.Arrays;
import java.util.Scanner;
public class Poker {
    public static void printCards(int[] cards)
    {
        for (int i = 0; i < cards.length-1; i++) {

            System.out.print(cards[i]+" ");
        }
        System.out.println(cards[cards.length-1]);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int[] cards = new int[players];
        for (int i = 1; i < 5+1; ++i) {
            try {
                Thread.sleep(players*500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Arrays.fill(cards, i);
            System.out.println("Количество карт у всех игроков");
            printCards(cards);

        }
    }
}
