package pt.com.heitor.saldanha;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(24,9));
        System.out.println(getDurationString(8000));

        System.out.println(5 * 5 * Math.PI);

        long minutos = 561600;
        long hour = minutos / 60;
        long day = hour / 24;
        long year = day / 365;
        System.out.println(minutos + " min = " + year + " and " + (day % 365) + " d");

    }

    public static String getDurationString(int minutes, int seconds) {

        int myHour = (minutes / 60);
        int myRemainingMinutes = (seconds % 60);

        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return "Invalid value";
        }
        String hoursString = myHour + "h ";
        if (myHour < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = myRemainingMinutes + "m ";
        if (myRemainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + minutesString + secondsString;

    }

    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;
        int myRemainingMinutes = (seconds % 60);
        if (seconds < 0) {
            return "Invalid value";
        }
        return getDurationString(minutes, myRemainingMinutes);

    }
}
