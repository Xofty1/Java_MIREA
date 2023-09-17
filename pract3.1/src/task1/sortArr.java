package task1;
import java.util.Random;
import java.util.*;
import java.util.Scanner;
public class sortArr {
    public static void randomArr(double[] arr, int len)
    {
        Random rand = new Random();
        double r;
        for (int i = 0; i < len; i++) {
            r = rand.nextDouble();
            arr[i] = r;
        }
    }

    public static void randomArrMath(double[] arr, int len)
    {
        double r;
        for (int i = 0; i < len; i++) {
            r = Math.random();
            arr[i] = r;
        }
    }
public static void printArr(double[] arr, int len)
{
    for (int i = 0; i < len; i++)
    {
        System.out.printf("%.3f ", arr[i]);
    }
}

    public static void sortAr(double[] arr, int len)
    {
        double temp;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {

                if (arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        double[] arr = new double[len];
        randomArr(arr, len);

        printArr(arr, len);
        sortAr(arr,len);
        System.out.println();
        printArr(arr, len);
        System.out.println();

        randomArrMath(arr, len);

        printArr(arr, len);
        sortAr(arr,len);
        System.out.println();
        printArr(arr, len);
    }
}
