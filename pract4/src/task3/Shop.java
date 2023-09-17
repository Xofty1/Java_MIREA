package task3;
import java.util.Objects;
import java.util.Scanner;
import java.lang.Thread;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Basket basket = new Basket(0);

        Catalog catalog = new Catalog();
        catalog.setCatalog();

        System.out.println("Регистрация пользователя");
        System.out.println("Введите логин: ");
        String login = sc.next();
        System.out.println("Введите пароль: ");
        String password = sc.next();
        Users user = new Users(login, password);

        System.out.println("Авторизация");
        boolean f = false;
        while (f != true)
        {
            System.out.println("Введите логин: ");
            String loginF = sc.next();

            System.out.println("Введите пароль: ");
            String passwordf = sc.next();

            if (!Objects.equals(loginF, user.getLogin()) || !Objects.equals(passwordf, user.getPassword()))
            {
                System.out.println("Неверный логин или пароль");
            }
            else{
                f = true;
                System.out.println("Авторизация прошла успешно");
            }
        }


        catalog.loading();

        while (f) {
            System.out.println("Choose laptops (1) or phones (2)");
            int code = sc.nextInt();
            catalog.printCatalog(code);

            if (code == 1) {
                System.out.println("Добавить в корзину laptop с названием: ");
                String laptop = sc.next();
                Laptops lp = new Laptops(laptop, catalog.getCostFromName(laptop));
                if (lp.getCost() == 0)
                {
                    System.out.println("Такого Laptop нет");
                    continue;
                }
                basket.addItem(lp);
            } else if (code == 2) {
                System.out.println("Добавить в корзину phone с названием: ");
                String phone = sc.next();
                Phones ph = new Phones(phone, catalog.getCostFromName(phone));
                if (ph.getCost() == 0)
                {
                    System.out.println("Такого Phone нет");
                    continue;
                }
                basket.addItem(ph);
            }
            System.out.println("Корзина");
            basket.printBasket();
            System.out.println("Хотите добавить что-то ещё?");
            String nx = sc.next();
            if (!Objects.equals(nx, "yes"))
            {
                f = false;
            }
        }

    }
}
