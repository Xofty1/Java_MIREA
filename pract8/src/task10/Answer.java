package task10;
import java.lang.Math;
import java.util.SortedMap;

import static java.lang.Math.pow;

public class Answer {
    public int help(int a)
    {
        int c = 0;
        while (a>0)
        {
            a/=10;
            c++;
        }
        return c-1;
    }
    public int ans(int v){
        if (v<10)
            return v;
        else {
            return (int) (ans((int) (v%pow(10,help(v))))*10+(v/pow(10,help(v))));
        }
    }

    public static void main(String[] args) {
        Answer n = new Answer();
        System.out.println(n.ans(123456789));
    }
}
