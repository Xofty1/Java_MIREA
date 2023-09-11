package task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();
        scanner.close();

        int wordCount = countWords(input);
        System.out.println("Введено " + wordCount + " слов.");
    }

    private static int countWords(String input) {
        input = input.replaceAll("\s{2,}", " ");
        return input.split(" ").length;
    }
}

