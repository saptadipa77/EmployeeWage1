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
        System.out.println("UC1 Attendance: " + ac.getAttendance());
        System.out.println("UC2 Daily Wage: " + dw.calculateDailyWage());
        System.out.println("UC3 Part-Time Wage: " + pt.calculatePartTimeWage());
        System.out.println("Working Hours Today: " + hours);
        System.out.println("UC5 Monthly Wage: " + mw.calculateMonthlyWage());
        System.out.println("UC6 Conditional Wage: " + cw.calculateConditionalWage());
        System.out.println("Total Employee Wage (Refactored UC7): " + wage);
    }
}