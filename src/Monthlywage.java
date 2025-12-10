public class Monthlywage {

    final int wagePerHour = 20;

    public int calculateMonthlyWage() {

        AttendanceCheck ac = new AttendanceCheck();

        int totalWage = 0;

        for (int day = 1; day <= 20; day++) {

            int hours = ac.getWorkingHours();
            int dailyWage = hours * wagePerHour;

            totalWage += dailyWage;

            System.out.println("Day " + day +
                    " | Hours: " + hours +
                    " | Daily Wage: " + dailyWage);
        }

        return totalWage;
    }
}

