public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        AttendanceCheck ac = new AttendanceCheck();
        DailyWage dw = new DailyWage();
        Parttime pt = new Parttime();
        int hours = ac.getWorkingHours();
        Monthlywage mw = new Monthlywage();
        Conditionalwage cw = new Conditionalwage();
        // Using Class Method + Class Variables (Refactor)
        Refractor ref = new Refractor(20, 20, 100);
        int wage = ref.computeWage();
        Company meta=new Company();
        meta.setNoofworkdayspermonth(20);
        meta.setNoofworkhourspermonth(200);
        meta.setWageperhour(300);
        empwagebuilder builder = new empwagebuilder();
        System.out.println("UC1 Attendance: " + ac.getAttendance());
        System.out.println("UC2 Daily Wage: " + dw.calculateDailyWage());
        System.out.println("UC3 Part-Time Wage: " + pt.calculatePartTimeWage());
        System.out.println("Working Hours Today: " + hours);
        System.out.println("UC5 Monthly Wage: " + mw.calculateMonthlyWage());
        System.out.println("UC6 Conditional Wage: " + cw.calculateConditionalWage());
        System.out.println("Total Employee Wage (Refactored UC7): " + wage);
        System.out.println("Meta's work days"+" "+meta.getNoofworkdayspermonth());
        System.out.println("Meta's work hours"+" "+meta.getNoofworkhourspermonth());
        System.out.println("Meta's wage per month"+" "+meta.getWageperhour());

        builder.addCompany("Meta", 20, 20, 100);
        builder.addCompany("Infosys", 25, 22, 120);
        builder.addCompany("Walmart", 30, 25, 150);

        builder.computeWages();

        System.out.println("\nQueried Wage:");
        System.out.println("Total Wage for Tata: " + builder.getTotalWage("Tata"));
        System.out.println("Daily Wage of Tata: " + builder.getDailyWages("Tata"));

        System.out.println("\nTotal Wage for Infosys: " + builder.getTotalWage("Infosys"));
        System.out.println("Daily Wage of Infosys: " + builder.getDailyWages("Infosys"));
    }
}
