public class Refractor {

    // Class Variables
    private int wagePerHour;
    private int maxDays;
    private int maxHours;

    // Constructor to initialize
    public Refractor(int wagePerHour, int maxDays, int maxHours) {
        this.wagePerHour = wagePerHour;
        this.maxDays = maxDays;
        this.maxHours = maxHours;
    }

    public int computeWage() {

        AttendanceCheck attendance = new AttendanceCheck();

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < maxHours && totalDays < maxDays) {
            int hours = attendance.getWorkingHours();
            totalHours += hours;
            totalDays++;
        }

        return totalHours * wagePerHour;
    }
}

