public class EmployeeWage {
    public static final int wagePerHr = 20;
    public static final int fullDayHr = 8;

    public static void main(String[] args) {
        int dailyWage;
        System.out.println("Welcome to Employee Wage Computation Program");
        int check = (int) (Math.random() * 2);
        if (check == 1) {
            System.out.println("Employee is present");
            dailyWage = wagePerHr * fullDayHr;
            System.out.println("Daily wage is :" + dailyWage);
        } else {
            System.out.println("Employee is absent");
        }
    }
}
