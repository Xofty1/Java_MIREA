package task1;
import javax.sound.midi.Soundbank;
import java.util.Comparator;
import java.util.Random;
public class Tester implements Comparator {
    private int len = 100;
    Student[] students;
    public Tester() {}
    public Tester(int len) {
        this.len = len;
        this.students = new Student[len];
    }

    public void setLen(int len) {
        this.len = len;
    }

    public void outArray()
    {
        for (Student student : this.students) {
            System.out.println(student.toStr());
        }
    }
    public void quickSort( int low, int high) {
        if (low < high) {
            int pivotIndex = partition(this, low, high);
            this.quickSort(low, pivotIndex - 1);
            this.quickSort(pivotIndex + 1, high);
        }
    }

    private static int partition(Tester t, int low, int high) {
        double pivot = t.students[high].getAverage();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (t.students[j].getAverage() > pivot) {
                i++;
                swap(t, i, j);
            }
        }
        swap(t, i + 1, high);
        return i + 1;
    }

    private static void swap(Tester t, int i, int j) {
        Student temp = t.students[i];
        t.students[i] = t.students[j];
        t.students[j] = temp;
    }

    private static void swapS(Student s1, Student s2) {
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    }

    public void setArray(){
        Random rand = new Random();
        for (int i = 0; i < this.students.length; i++) {
            int course= Math.abs(rand.nextInt() % 4);
            int group = Math.abs(rand.nextInt() % 3);
            double average = Math.round((rand.nextDouble()* 3+2)*100.0)/100.0;
            this.students[i] = new Student(course,group,average);
        }
    }



    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }


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
            left[i].setGroup(t[i].getGroup());
            left[i].setAverage(t[i].getAverage());
            left[i].setCourse(t[i].getCourse());
        }
        for (int i = mid; i < t.length; i++) {
            right[i - mid].setGroup(t[i].getGroup());
            right[i - mid].setAverage(t[i].getAverage());
            right[i - mid].setCourse(t[i].getCourse());
        }

        mergeSort(left);
        mergeSort(right);
        merge(t, left, right);
    }

    private static void merge(Student[] t, Student[] left, Student[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].getGroup() <= right[j].getGroup()) {

                t[k].setGroup(left[i].getGroup());
                t[k].setAverage(left[i].getAverage());
                t[k].setCourse(left[i].getCourse());
                i++;
            } else {
                t[k].setGroup(right[j].getGroup());
                t[k].setAverage(right[j].getAverage());
                t[k].setCourse(right[j].getCourse());
                j++;
            }
            k++;
        }

        while (i < left.length) {
            t[k].setGroup(left[i].getGroup());
            t[k].setAverage(left[i].getAverage());
            t[k].setCourse(left[i].getCourse());
            i++;
            k++;
        }

        while (j < right.length) {
            t[k].setGroup(right[j].getGroup());
            t[k].setAverage(right[j].getAverage());
            t[k].setCourse(right[j].getCourse());
            j++;
            k++;
        }
    }


    public static Tester mergeUniversity(Tester t1,Tester t2){
        Tester t = new Tester(200);
        for (int i = 0; i < t1.students.length; i++) {
           t.students[i] = t1.students[i];
            t.students[i+100] = t2.students[i];
        }

        return t;
    }
    public static void main(String[] args) {
        Tester t = new Tester(100);
        Tester t2 = new Tester(100);
        t.setArray();
        t2.setArray();
        t.outArray();
        t.quickSort(0,99); // average marks sort
        System.out.println();
        t.outArray();
        mergeSort(t.students);// group sort
        System.out.println();
        t.outArray();
        System.out.println();
        Tester t3 = new Tester(200);// merge and sort
        t3 = mergeUniversity(t,t2);
        t3.quickSort(0,199);
        t3.outArray();
    }
}
