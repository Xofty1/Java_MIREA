package task6;

public class Employer {
    private String firstName;
    private String lastName;
    protected double income;
    private double averageSum;
    private int day;

    public double getIncome() {
        if (this.day >=24)
            income *= 12;
        return income;
    }

    public double getAverageSum() {
        return averageSum;
    }

    public double getDay() {
        return day;
    }

    public Employer(String firstName, String lastName, double income, double averageSum, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
        this.averageSum = averageSum;
        this.day = day;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
