public class EmployeeWage {
    //   public static CompanyEmployeeWage1 companyEmployeeWage;
    int numberOfCompanies = 0;
    CompanyEmployeeWage[] companyEmployeeWagesArray = new CompanyEmployeeWage[5];

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompanyEmpWage("jio", 100, 30, 25);
        employeeWage.addCompanyEmpWage("Airtel", 90, 25, 30);
        employeeWage.calWageComputation();
    }

    public void addCompanyEmpWage(String companyName, int totalWorkingHr, int totalWorkingDays, int wagePerHr) {
        companyEmployeeWagesArray[numberOfCompanies] = new CompanyEmployeeWage(companyName, totalWorkingHr, totalWorkingDays, wagePerHr);
        numberOfCompanies++;
    }

    public void calWageComputation() {
        for (int i = 0; i < numberOfCompanies; i++) {
            companyEmployeeWagesArray[i].setTotalEmployeeWage(this.calWageComputation(companyEmployeeWagesArray[i]));
            System.out.println(companyEmployeeWagesArray[i]);
        }
    }


    public int calWageComputation(CompanyEmployeeWage companyEmployeeWage) {
        int empHr = 0, maxWorkingDays = 0, maxWorkingHr = 0;
        System.out.println("Welcome to Employee Wage Computation Program");

        while (maxWorkingHr <= companyEmployeeWage.totalWorkingHr && maxWorkingDays < companyEmployeeWage.totalWorkingDays) {
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


            int empWage = maxWorkingHr * companyEmployeeWage.wagePerHr;
            companyEmployeeWage.totalEmployeeWage = companyEmployeeWage.totalEmployeeWage + empWage;
//        System.out.println( companyEmployeeWage.companyName +" --> Company Total Employee wage is :" + totalEmpWage);
        }
        return companyEmployeeWage.totalEmployeeWage;
    }
}

