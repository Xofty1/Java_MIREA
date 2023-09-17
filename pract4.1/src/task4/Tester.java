package task4;

public class Tester {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        double[][] data1 = {{1.0, 2.0}, {4.0,  6.0}};
        matrix1.setData(data1);

        Matrix matrix2 = new Matrix(2, 2);
        double[][] data2 = {{2.0, 6.0}, {1.0, 7.0}};
        matrix2.setData(data2);


        Matrix mult = matrix1.mult(matrix2);
        mult.print();
        Matrix add = matrix2.add(matrix1);
        System.out.println();
        add.print();
    }
}
