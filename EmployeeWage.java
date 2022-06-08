public class EmployeeWage {

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.calWageComputation("TCS", 20, 20, 100);
        System.out.println("---------------------------------------------------------------------------");
        employeeWage.calWageComputation("Info", 25, 25, 90);
        System.out.println("---------------------------------------------------------------------------");
        employeeWage.calWageComputation("TATA", 30, 31, 110);

    }

    public void calWageComputation(String company, int wagePerHr, int totalWorkingDays, int totalWorkingHr) {
        int empHr, maxWorkingDays = 0, maxWorkingHr = 0;
        System.out.println("Welcome to Employee Wage Computation Program");
        while (maxWorkingHr <= totalWorkingHr && maxWorkingDays < totalWorkingDays) {
            maxWorkingDays++;
            int check = (int) (Math.random() * 3);
            switch (check) {
                case 1:
                    empHr = 8;
                    break;
                case 2:
                    empHr = 4;
                    break;
                default:
                    empHr = 0;
                    break;
            }

            maxWorkingHr += empHr;

        }
        int totalEmpWage = maxWorkingHr * wagePerHr;
        System.out.println(company + " --> Company Total Employee wage is :" + totalEmpWage);
    }
}