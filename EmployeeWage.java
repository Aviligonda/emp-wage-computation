public class EmployeeWage {
    public static final int wagePerHr = 20;
    public static final int totalWorkingDays = 20;

    public static void main(String[] args) {
        int dailyWage, empHr = 0, monthlyWage;
        System.out.println("Welcome to Employee Wage Computation Program");
        int check = (int) (Math.random() * 3);
        switch (check) {
            case 1:
                System.out.println("Employee present in full day");
                empHr = 8;
                break;
            case 2:
                System.out.println("Employee present in half day");
                empHr = 4;
                break;
            default:
                System.out.println("Employee is absent");
                empHr = 0;
                break;
        }
        dailyWage = empHr * wagePerHr;
        System.out.println("Daily wage is :" + dailyWage);
        monthlyWage = dailyWage * totalWorkingDays;
        System.out.println("Monthly wage is :" + monthlyWage);
    }
}
