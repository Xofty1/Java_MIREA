package task3;

import java.util.Random;

public class YesOrNo {

    public static void randomArr(int[] arr, int len)
    {
        Random rand = new Random();
        int r;
        for (int i = 0; i < len; i++) {
            r = rand.nextInt(90);
            arr[i] = r+10;
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
    public static boolean isB(int[] arr, int len)
    {
        for (int i = 0; i < len-1; i++) {
            if (arr[i] < arr[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] mas = new int[4];
        randomArr(mas,4);
        printArr(mas,4);

        if (isB(mas,4))
        {
            System.out.println("Строго возрастающая последовательность");
        }
        else
        {
            System.out.println("Не строго возрастающая последовательность");
        }
    }
}
