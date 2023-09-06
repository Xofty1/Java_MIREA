package newShop;
import java.util.Objects;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество компьютеров в вашем магазине");
        int size = sc.nextInt();

        Shop sh = new Shop(size);
        System.out.println("Для того чтобы закончить процесс напишите 000");
        System.out.println("Для того чтобы удалить компьютер напишите 999");
        sc.nextLine();
        String newComp = sc.nextLine();

        while(!Objects.equals(newComp, "000"))
        {
            if (Objects.equals(newComp, "999"))
            {
                System.out.println("Какой компьютер вы хотите удалить?");
                String delComp = sc.nextLine();
                if (sh.deletComp(delComp))
                    System.out.println("Компьютер " + delComp + " успешно удален");
                else
                    System.out.println("Компьютер " + delComp + " не найден");
            }
            else {
                sh.setNewComp(newComp);
            }

            newComp = sc.nextLine();
        }

    }
}
