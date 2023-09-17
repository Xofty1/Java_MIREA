package task6;

public class Tester {
    public static void main(String[] args) {


        Employer[] emp = new Employer[4];
        Employer m1 = new Manager("Artem", "C", 100, 50, 26);
        Employer m2 = new Manager("Igor", "C", 100, 50, 16);
        Employer e1 = new Employer("Roman", "C", 100, 50, 26);
        Employer e2 = new Employer("Nikita", "C", 100, 50, 21);

        emp[0] = m1;
        emp[1] = m2;
        emp[2] = e1;
        emp[3] = e2;
        for (int i = 0; i < 4; i++) {
            if (emp[i] instanceof Manager) {
                Manager manager = (Manager) emp[i];
                System.out.println(manager.getIncome());
            }
            else{

                    Employer employer = (Employer) emp[i];
                    System.out.println(employer.getIncome());
            }
        }
    }
}
