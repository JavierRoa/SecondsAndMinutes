public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(-5));
        System.out.println(getDurationString(59));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(-2, 59));
        System.out.println(getDurationString(2, -59));
        System.out.println(getDurationString(2, 59));
        System.out.println(getDurationString(2, 60));
        System.out.println(getDurationString(60, 59));
        System.out.println(getDurationString(120, 59));
    }
    private static String getDurationString(int seconds) {
        if(seconds<0) {
            return "Invalid parámeter 'seconds'. Must be greater or equal than 0.";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
    private static String getDurationString(int minutes, int seconds) {
        if(minutes<0) {
            return "Invalid parámeter 'minutes'. Must be greater or equal than 0.";
        } else if (seconds<0 || seconds>59) {
            return "Invalid parámeter 'seconds'. Must be greater or equal than 0 and less or equal than 59.";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
