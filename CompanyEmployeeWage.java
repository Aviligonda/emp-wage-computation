interface InterfaceCompanyWage {
    public abstract void addCompanyEmpWage(String companyName, int totalWorkingHr, int totalWorkingDays, int wagePerHr);

    public abstract void calWageComputation();


    public class CompanyEmployeeWage {
        String companyName;
        int totalWorkingHr;
        int totalWorkingDays;
        int wagePerHr;
        int totalEmployeeWage;

        public CompanyEmployeeWage(String companyName, int totalWorkingHr, int totalWorkingDays, int wagePerHr) {
            this.companyName = companyName;
            this.totalWorkingHr = totalWorkingHr;
            this.totalWorkingDays = totalWorkingDays;
            this.wagePerHr = wagePerHr;
            this.totalEmployeeWage = totalEmployeeWage;
        }

        public int getTotalEmployeeWage() {
            return totalEmployeeWage;
        }

        public void setTotalEmployeeWage(int totalEmployeeWage) {
            this.totalEmployeeWage = totalEmployeeWage;
        }

        @Override
        public String toString() {
            return "CompanyEmployeeWage{" +
                    "companyName='" + companyName + '\'' +
                    ", totalEmployeeWage=" + totalEmployeeWage +
                    '}';
        }
    }
}