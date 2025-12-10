public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        AttendanceCheck ac = new AttendanceCheck();
        DailyWage dw = new DailyWage();
        System.out.println("UC1 Attendance: " + ac.getAttendance());
        System.out.println("UC2 Daily Wage: " + dw.calculateDailyWage());
    }
}