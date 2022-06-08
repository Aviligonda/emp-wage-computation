public class EmployeeWage {
    public static final int wagePerHr = 20;
    public static final int totalWorkingDays = 20;
    public static final int totalWorkingHr = 100;

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.calWage();
    }

    public void calWage() {
        int dailyWage, empHr = 0, monthlyWage = 0, maxWorkingDays = 0, maxWorkingHr = 0;
        System.out.println("Welcome to Employee Wage Computation Program");
        while (maxWorkingHr <= totalWorkingHr && maxWorkingDays < totalWorkingDays) {
            maxWorkingDays++;
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

            maxWorkingHr += empHr;
            System.out.println("Day#" + maxWorkingDays + "Employee hours :" + empHr);

        }
        int totalEmpWage = maxWorkingHr * wagePerHr;
        System.out.println("Total employee wage is :" + totalEmpWage);

    }

}