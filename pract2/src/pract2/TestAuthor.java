package pract2;


public class TestAuthor{
    public static void main(String[] args) {
        Author Pushkin = new Author("Aleksandr", "pushka@mail.ru", 'M');
        System.out.println(Pushkin.getEmail());
        Pushkin.setEmail("teperNePushka@mail.ru");
        System.out.println(Pushkin.getEmail());
        System.out.println(Pushkin.getName());
        System.out.println(Pushkin.getGender());
    }
}
