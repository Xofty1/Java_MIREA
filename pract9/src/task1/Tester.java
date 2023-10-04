package task1;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class Tester {
    private Student[] students = new Student[30];
    private Comparable[] idNum = new Comparable[30];

    public void doGroup() {
        Comparable temp;
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {

            int a = Math.abs(rand.nextInt() % 40);
            temp = a;
            Student new_student = new Student(a);
            students[i] = new_student;
            idNum[i] = temp;
        }
    }

    public static void compToStudent(Comparable[] c,Tester t )
    {
        for (int i = 0; i < 30; i++) {
            t.students[i].setId((Integer) c[i]);
        }
    }


    public void printStudent()
    {
        for (int i = 0; i < 30; i++) {
            System.out.println(students[i].toStr());
        }
    }



    public static void insertionSort(Comparable[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            Comparable key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        Tester students = new Tester();
        students.doGroup();
        students.printStudent();
        insertionSort(students.idNum);
        compToStudent(students.idNum,students);
        System.out.println();
        students.printStudent();
    }
}
