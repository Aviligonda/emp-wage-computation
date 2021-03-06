import java.util.ArrayList;

public class EmployeeWage implements InterfaceCompanyWage {
    //    CompanyEmployeeWage[] companyEmployeeWagesArray = new CompanyEmployeeWage[5];
    static ArrayList<CompanyEmployeeWage> companyEmployeeWagesArray = new ArrayList<CompanyEmployeeWage>();
    //   public static CompanyEmployeeWage1 companyEmployeeWage;
    int numberOfCompanies = 0;

    public static void main(String[] args) {
        InterfaceCompanyWage employeeWage = new EmployeeWage();
        employeeWage.addCompanyEmpWage("jio", 100, 30, 25);
        employeeWage.addCompanyEmpWage("Airtel", 90, 25, 30);
        employeeWage.calWageComputation();
        employeeWage.getTotalWage("jio");

    }

    public void addCompanyEmpWage(String companyName, int totalWorkingHr, int totalWorkingDays, int wagePerHr) {
        CompanyEmployeeWage companyEmployeeWage = new CompanyEmployeeWage(companyName, totalWorkingHr, totalWorkingDays, wagePerHr);
        companyEmployeeWagesArray.add(companyEmployeeWage);
    }

    public void calWageComputation() {
        for (int i = 0; i < companyEmployeeWagesArray.size(); i++) {
            CompanyEmployeeWage companyEmployeeWage = companyEmployeeWagesArray.get(i);
            companyEmployeeWage.setTotalEmployeeWage(this.calWageComputation(companyEmployeeWage));
            System.out.println(companyEmployeeWage);
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
            System.out.println(companyEmployeeWage.companyName + "  Day#" + maxWorkingDays + " Employee wge " + empWage);
            companyEmployeeWage.totalEmployeeWage = companyEmployeeWage.totalEmployeeWage + empWage;

        }

        return companyEmployeeWage.totalEmployeeWage;
    }

    public void getTotalWage(String companyName) {
        for (int i = 0; i < companyEmployeeWagesArray.size(); i++) {
            String name = companyEmployeeWagesArray.get(i).companyName;
            if (name.equals(companyName)) {
                int totalWage = companyEmployeeWagesArray.get(i).totalEmployeeWage;
                System.out.println(companyName + " Total Employee Wage is :" + totalWage);
                break;
            } else {
                continue;
            }
        }
    }


}

