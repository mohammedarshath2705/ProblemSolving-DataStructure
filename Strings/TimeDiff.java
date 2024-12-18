package Strings;

public class TimeDiff {
    static String timeGap(String st, String et) {
        String[] startParts = st.split(":");
        String[] endParts = et.split(":");

        int startHour = Integer.parseInt(startParts[0]);
        int startMinute = Integer.parseInt(startParts[1]);
        int startSecond = Integer.parseInt(startParts[2]);

        int endHour = Integer.parseInt(endParts[0]);
        int endMinute = Integer.parseInt(endParts[1]);
        int endSecond = Integer.parseInt(endParts[2]);

        int startTotalSeconds = startHour * 3600 + startMinute * 60 + startSecond;
        int endTotalSeconds = endHour * 3600 + endMinute * 60 + endSecond;

        int durationInSeconds = endTotalSeconds - startTotalSeconds;

        if (durationInSeconds < 0) {
            durationInSeconds += 24 * 3600;
        }

        int hours = durationInSeconds / 3600;
        durationInSeconds %= 3600;
        int minutes = durationInSeconds / 60;
        int seconds = durationInSeconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        System.out.println(timeGap("13:50:45", "14:55:50"));
        System.out.println(timeGap("23:59:59", "00:00:01"));
        System.out.println(timeGap("10:20:30", "09:15:25"));
        System.out.println(timeGap("00:00:00", "00:00:00"));
        System.out.println(timeGap("12:00:00", "12:00:01"));
    }
}
