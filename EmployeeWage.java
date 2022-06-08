public class EmployeeWage {
    public static final int wagePerHr = 20;
    public static final int fullDayHr = 8;
    public static final int halfDayHr = 4;

    public static void main(String[] args) {
        int dailyWage;
        System.out.println("Welcome to Employee Wage Computation Program");
        int check = (int) (Math.random() * 3);
        if (check == 1) {
            System.out.println("Employee is present in full day");
            dailyWage = wagePerHr * fullDayHr;
            System.out.println("Daily wage is :" + dailyWage);
        } else if (check == 2) {
            System.out.println("Employee is present in half day");
            dailyWage = wagePerHr * halfDayHr;
            System.out.println("Daily wage is :" + dailyWage);
        } else {
            System.out.println("Employee is absent");
        }
    }
}
