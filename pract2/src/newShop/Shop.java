package newShop;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;
public class Shop {
    private String[] computer;
    private int len = 0;
    private int lenmax;

    public String getComp(int index)
    {
        return this.computer[index];
    }


    public Shop(int len)
    {
        this.lenmax = len;
        this.computer = new String[len];
    }

    public void setNewComp(String newComp)
    {
        if (this.len+1>this.lenmax)
        {
            System.out.println("Больше компьютеров добавлять нельзя");
        }
        else
        {
            computer[len] = newComp;
            len +=1;
            System.out.println("Компьютер успешно добавлен");
        }
    }

    public boolean deletComp(String Comp)
    {
        for (int i = 0; i < this.len; i++) {
            if (Objects.equals(computer[i], Comp))
            {
                String[] newComputer = new String[len];
                System.arraycopy(computer,0, newComputer,0,1);
                System.arraycopy(computer, 1 + 1, newComputer, 1, computer.length - 1 - 1);
                this.computer=newComputer;
                this.len -=1;
                return true;
            }
        }
        return false;

    }

    public int searchComp(String Comp)
    {
        for (int i = 0; i < this.len; i++) {
            if (this.computer[i] == Comp) {
                return i + 1;
            }
        }
        return 0;
    }
}
