public class EmployeeWage {
    public final String company;
    public final int wagePerHr;
    public final int totalWorkingHr;
    public final int totalWorkingDays;

    public EmployeeWage(String company, int wagePerHr, int totalWorkingHr, int totalWorkingDays) {
        this.company = company;
        this.wagePerHr = wagePerHr;
        this.totalWorkingHr = totalWorkingHr;
        this.totalWorkingDays = totalWorkingDays;
    }

    public static void main(String[] args) {
        EmployeeWage tcs = new EmployeeWage("TCS", 20, 20, 100);
        EmployeeWage info = new EmployeeWage("INFO", 25, 30, 90);
        tcs.calWageComputation();
        System.out.println(tcs);
        info.calWageComputation();
        System.out.println(info);
    }

    @Override
    public String toString() {
        return "EmployeeWage{" +
                "company='" + company + '\'' +
                ", wagePerHr=" + wagePerHr +
                ", totalWorkingHr=" + totalWorkingHr +
                ", totalWorkingDays=" + totalWorkingDays +
                '}';
    }

    public void calWageComputation() {
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