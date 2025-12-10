public class Conditionalwage {

    final int wagePerHour = 20;

    public int calculateConditionalWage() {

        AttendanceCheck ac = new AttendanceCheck();

        int totalHours = 0;
        int days = 0;

        while (totalHours < 100 && days < 20) {

            days++;

            int hours = ac.getWorkingHours();
            totalHours += hours;
        }

        return totalHours * wagePerHour;
    }
}

