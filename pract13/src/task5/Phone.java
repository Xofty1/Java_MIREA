package task5;

public class Phone {
    public static String formatPhoneNumber1(String input) {
        if (input.startsWith("8"))
            return input;
        input = input.replaceAll("[^0-9]", "");
        return "+" + input;
    }
    public static String formatPhoneNumber2(String input) {

        input = input.replaceAll("[^0-9]", "");
        return "+" + input.charAt(0) + input.substring(1, 4) + "-" + input.substring(4, 7) + "-" + input.substring(7);


    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+10428965221";
        String phoneNumber3 = "89175655655";

        String formattedPhoneNumber1 = formatPhoneNumber1(phoneNumber1);
        String formattedPhoneNumber2 = formatPhoneNumber2(phoneNumber2);
        String formattedPhoneNumber3 = formatPhoneNumber1(phoneNumber3);

        System.out.println("Форматированный номер 1: " + formattedPhoneNumber1);
        System.out.println("Форматированный номер 2: " + formattedPhoneNumber2);
        System.out.println("Форматированный номер 3: " + formattedPhoneNumber3);
    }
}





