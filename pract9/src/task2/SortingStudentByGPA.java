package task2;

import java.util.Random;

public class SortingStudentByGPA implements Comparator{
    Student[] students = new Student[30];
    public void doGroup() {
        Comparable temp;
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            int a = Math.abs(rand.nextInt() % 40);
            temp = a;
            Student new_student = new Student(a);
            students[i] = new_student;
        }
    }
    @Override
    public void quickSort( int low, int high) {
        if (low < high) {
            int pivotIndex = partition(this, low, high);
            this.quickSort(low, pivotIndex - 1);
            this.quickSort(pivotIndex + 1, high);
        }
    }

    private static int partition(SortingStudentByGPA t, int low, int high) {
        int pivot = t.students[high].getMarks();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (t.students[j].getMarks() < pivot) {
                i++;
                swap(t, i, j);
            }
        }
        swap(t, i + 1, high);
        return i + 1;
    }

    private static void swap(SortingStudentByGPA t, int i, int j) {
        int temp = t.students[i].getMarks();
        t.students[i].setMarks(t.students[j].getMarks());
        t.students[j].setMarks(temp);
    }

    public void printStudent()
    {
        for (int i = 0; i < 30; i++) {
            System.out.println(students[i].toStr());
        }
    }

    public static void main(String[] args) {
        SortingStudentByGPA s = new SortingStudentByGPA();
        s.doGroup();
        s.quickSort(0,29);
        s.printStudent();


    }
}
