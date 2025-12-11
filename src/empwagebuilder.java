import java.util.ArrayList;

public class empwagebuilder implements Iwagecomputation {

    private ArrayList<Compempwage> companyList;

    public empwagebuilder() {
        companyList = new ArrayList<>();
    }

    @Override
    public void addCompany(String name, int rate, int days, int hours) {
        Compempwage company = new Compempwage(name, rate, days, hours);
        companyList.add(company);
    }

    @Override
    public void computeWages() {
        for (Compempwage company : companyList) {
            int totalWage = computeCompanyWage(company);
            company.setTotalWage(totalWage);
            System.out.println(company);
        }
    }

    private int computeCompanyWage(Compempwage c) {

        int totalHours = 0;
        int totalDays = 0;
        int wage = 0;

        while (totalHours <= c.maxWorkingHours && totalDays < c.maxWorkingDays) {
            totalDays++;

            int empCheck = (int) (Math.random() * 3); //0 1 2
            int empHours;

            switch (empCheck) {
                case 1:
                    empHours = 8;   // full time
                    break;
                case 2:
                    empHours = 4;   // part-time
                    break;
                default:
                    empHours = 0;  // absent
                    break;
            }

            totalHours += empHours;
            wage += empHours * c.empRatePerHour;
        }

        return wage;
    }

    @Override
    public int getTotalWage(String companyName) {
        for (Compempwage c : companyList) {
            if (c.companyName.equalsIgnoreCase(companyName)) {
                return c.totalWage;
            }
        }
        return -1; // not found
    }
}

