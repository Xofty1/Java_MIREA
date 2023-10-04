package task9;

public class N_and_O {
    public int answer(int a, int b, int lastDigit){
        if (a < 0 || b < 0) {
            return 0;
        }
        if (a == 0 && b == 0) {
            return 1;
        }

        int count = 0;

        // Если последний символ был нулем, следующий может быть только единицей
        if (lastDigit == 0) {
            count += answer(a, b - 1, 1);
        }

        // Если последний символ был единицей, следующий может быть и нулем и единицей
        if (lastDigit != 0) {
            count += answer(a - 1, b, 0);
            count += answer(a, b - 1, 1);
        }

        return count;
    }

    public static void main(String[] args) {
        N_and_O ans = new N_and_O();
        System.out.println(ans.answer(2,3,1));
    }
}
