public class Compempwage {

    public String companyName;
    public int empRatePerHour;
    public int maxWorkingDays;
    public int maxWorkingHours;

    public int totalWage;

    public Compempwage(String companyName, int empRatePerHour,
                          int maxWorkingDays, int maxWorkingHours) {

        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Total Employee Wage for Company " + companyName + " is: " + totalWage;
    }
}

