import java.util.Random;

public class AttendanceCheck {

    public int getAttendance() {
        Random rand = new Random();
        return rand.nextInt(2); // 0 = absent, 1 = present
    }
}

