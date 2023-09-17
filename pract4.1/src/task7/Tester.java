package task7;

public class Tester {
    public static void main(String[] args) {


        Studyman[] sm = new Studyman[3];
        Studyman s1 = new Schoolboy();
        Studyman s2 = new Schoolboy();
        Studyman s3 = new Student();

        sm[0] = s1;
        sm[1] = s2;
        sm[2] = s3;

        for (int i = 0; i < 3; i++) {
            sm[i].say();
        }
    }
}