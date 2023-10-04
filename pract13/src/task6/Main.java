package task6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static StringBuilder getLine(String[] words) {
        StringBuilder result = new StringBuilder();

        if (words == null || words.length == 0) {
            return result;
        }

        result.append(words[0]);
        List<Integer> usedIndices = new ArrayList<>();
        usedIndices.add(0);

        while (usedIndices.size() < words.length) {
            boolean wordAdded = false;
            char lastChar = Character.toLowerCase(result.charAt(result.length() - 1));

            for (int i = 0; i < words.length; i++) {
                if (!usedIndices.contains(i) && Character.toLowerCase(words[i].charAt(0)) == lastChar) {
                    result.append(" ").append(words[i]);
                    usedIndices.add(i);
                    wordAdded = true;
                    break;
                }
            }

            if (!wordAdded) {
                break; // Не удалось добавить слово
            }
        }

        return result;
    }

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\USER\\Desktop\\study\\2course\\JavaProg\\Git_Java\\pract13\\src\\task6\\example.txt"));
            String line;
            List<String> words = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] wordArray = line.split(" ");
                for (String word : wordArray) {
                    words.add(word);
                }
            }

            reader.close();

            StringBuilder result = getLine(words.toArray(new String[0]));
            System.out.println("Результат: " + result.toString());
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}