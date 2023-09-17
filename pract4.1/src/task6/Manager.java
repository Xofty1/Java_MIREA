package task6;

public class Manager extends Employer{
    public Manager(String firstName, String lastName, int income, double averageSum, int day) {
        super(firstName, lastName, income, averageSum, day);
    }
    @Override
    public double getIncome()
    {
        if (this.getDay() >=24)
            this.setIncome(income * 12);
        return income+this.getAverageSum();
    }

}
