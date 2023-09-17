package task4;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void randomArr(int[] arr, int len)
    {
        Random rand = new Random();
        int r;
        for (int i = 0; i < len; i++) {
            r = rand.nextInt(len+1);
            arr[i] = r;
        }
    }
    public static void printArr(int[] arr, int len)
    {
        for (int i = 0; i < len; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int evenArr(int[] arr, int len, int[] arrEven)
    {
        int p = 0;
        for (int i = 0; i < len; i++) {
            if ((arr[i]%2) == 0)
            {
                arrEven[p] = arr[i];
                p+=1;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        while (sc.hasNextInt() != true)
        {
            System.out.println("Введите правильное число:");
            sc.next();
        }
        len = sc.nextInt();
        int[] mas = new int[len];
        int[] masEven = new int[len];
        randomArr(mas,len);
        printArr(mas,len);
        printArr(masEven,evenArr(mas,len,masEven));
    }
}
