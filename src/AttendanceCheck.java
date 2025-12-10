import java.util.Random;

public class AttendanceCheck {

    Random rand = new Random();
    public int getAttendance() {
        Random rand = new Random();
        return rand.nextInt(3); // 0 = absent, 1 = present
    }

    public int getWorkingHours() {

        int empCheck = rand.nextInt(3); // 0,1,2

        int hours;

        switch (empCheck) {
            case 1:
                hours = 8;   // full time
                break;

            case 2:
                hours = 4;   // part-time
                break;

            default:
                hours = 0;   // absent
        }

        return hours;
    }
}


