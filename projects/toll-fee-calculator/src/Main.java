public class Main {

    static double calcToll(int hour, boolean isMorning, boolean isWeekend) {
        // Validate hour
        if (hour < 0 || hour > 23) {
            System.out.println("Oops! That's not a valid hour.");
            return -1;
        }

        // Weekend tolls
        if (isWeekend) {
            if (hour < 7) {
                return 6.05;
            } else if (hour >= 7 && hour < 20) {
                return 7.15;
            } else {
                return 6.10;
            }
        }
        // Weekday tolls
        else {
            if (hour < 7) {
                return 6.15;
            } else if (hour >= 7 && hour < 10) {
                return 7.95;
            } else if (hour >= 10 && hour < 15) {
                return 6.90;
            } else if (hour >= 15 && hour < 20) {
                return 8.95;
            } else {
                return 6.40;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(calcToll(8, true, false));  // 7.95 (weekday morning)
        System.out.println(calcToll(13, false, false)); // 6.90 (weekday afternoon)
        System.out.println(calcToll(15, false, true));  // 7.15 (weekend afternoon)
        System.out.println(calcToll(5, true, true));    // 6.05 (weekend early morning)
        System.out.println(calcToll(25, true, false));  // invalid hour
    }
}
