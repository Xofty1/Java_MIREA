package task2;

public class Atelier implements MenClothing, WomenClothing {
    Object[] clothes = new Object[3];
    public void dressMan() {

        for (int i = 0; i < 3; i++) {
            if (clothes[i] instanceof Tie)
                System.out.println("Мужчина одет в галстук");
            else if (clothes[i] instanceof TShirt)
                System.out.println("Мужчина одет в футболку");
            else if (clothes[i] instanceof Pants)
                System.out.println("Мужчина одет в штаны");

        }
    }

    public void dressWoman(){
        for (int i = 0; i < 3; i++) {
            if (clothes[i] instanceof Skirt)
                System.out.println("Девушка одета в юбку");
            else if (clothes[i] instanceof TShirt)
                System.out.println("Девущка одета в футболку");
            else if (clothes[i] instanceof Pants)
                System.out.println("Девушка одета в штаны");
        }
        }
}