package task3;
import java.util.Arrays;
import task2.Skirt;

public class Basket {
    private Object[] basket;
    private int len;

    public Basket( int len) {
        this.basket = new Basket[len+1];
        this.len = len;
    }



    public void addItem(Object newItem)
    {
        Object[] basketN = new Object[this.len+1];
        for (int i = 0; i < this.len; i++) {
            basketN[i] = this.basket[i];
        }
        basketN[this.len] = newItem;
        this.len+=1;
        this.basket = basketN;
    }
    public void printBasket()
    {
        for (int i = 0; i < this.len; i++) {
            if (basket[i] instanceof Laptops)
                System.out.println(((Laptops) basket[i]).getName());
            if (basket[i] instanceof Phones)
                System.out.println(((Phones) basket[i]).getName());
        }
    }
}
