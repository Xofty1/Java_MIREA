package task3;

import java.util.Random;

public class Tester {
    Student[] students = new Student[30];

    public static void mergeSort(Student[] t) {
        if (t.length <= 1) {
            return;
        }
        int mid = t.length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[t.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = new Student();

        }
        for (int i = 0; i < t.length - mid; i++) {
            right[i] = new Student();
        }
        for (int i = 0; i < mid; i++) {
            left[i].setId(t[i].getId());
            left[i].setMark(t[i].getMark());
        }
        for (int i = mid; i < t.length; i++) {
            right[i - mid].setId(t[i].getId());
            right[i - mid].setMark(t[i].getMark());
        }

        mergeSort(left);
        mergeSort(right);
        merge(t, left, right);
    }

    private static void merge(Student[] t, Student[] left, Student[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].getId() <= right[j].getId()) {
                t[k].setId(left[i].getId());
                t[k].setMark(left[i].getMark());
                i++;
            } else {
                t[k].setId(right[j].getId());
                t[k].setMark(right[j].getMark());
                j++;
            }
            k++;
        }

        while (i < left.length) {
            t[k].setId(left[i].getId());
            t[k].setMark(left[i].getMark());
            i++;
            k++;
        }

        while (j < right.length) {
            t[k].setId(right[j].getId());
            t[k].setMark(right[j].getMark());
            j++;
            k++;
        }
    }
    public void doGroup() {
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {

            int a = Math.abs(rand.nextInt() % 40);
            int b = Math.abs(rand.nextInt() % 40);
            Student new_student = new Student(a, b);
            students[i] = new_student;
        }
    }
    public void printStudent()
    {
        for (int i = 0; i < 30; i++) {
            System.out.println(students[i].toStr());
        }
    }

    public static void main(String[] args) {
        Tester s = new Tester();
        s.doGroup();
        s.printStudent();
        mergeSort(s.students);
        System.out.println();
        s.printStudent();
    }
}
