package task4;

public class Matrix {
    private int rows;
    private int columns;
    private double[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            System.out.println("Матрицы имеют разные размеры. Невозможно выполнить сложение.");
            return null;
        }

        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix mult(Matrix other) {
        if (this.rows != other.columns) {
            System.out.println("Матрицы имеют неподходящие размеры. Невозможно выполнить умножение.");
            return null;
        }

        Matrix result = new Matrix(this.rows, other.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                double t = 0;
                for (int k = 0; k < this.columns; k++) {
                    t += this.data[i][k] * other.data[k][j];
                }
                result.data[i][j] += t;
            }
        }
        return result;
    }
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void setData(double[][] data) {
        if (data.length != rows || data[0].length != columns) {
            System.out.println("Неправильные размеры данных.");
            return;
        }

        this.data = data;
    }
}
