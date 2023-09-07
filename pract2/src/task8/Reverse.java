package task8;

import java.sql.SQLOutput;




public class Reverse {
    public static void reverseArray(Object[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start < end)
        {
            Object temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start +=1;
            end--;
        }
    }
    public static void printArr(Object[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Object[] arr = {1,2,3,4,5,6, "oi"};
        reverseArray(arr);
        printArr(arr);

    }
}
