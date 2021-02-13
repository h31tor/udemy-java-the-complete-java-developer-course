package pt.com.heitor.saldanha;

public class Main {

    public static void main(String[] args) {
        int month = 2;
        int year = 1995;
        boolean leapYear = isLeapYear(year);

        System.out.println("It's a Lear Year = " + leapYear);
        System.out.println("February is going to have " + getDaysInMonth(month, year) + " days.");
    }
        public static boolean isLeapYear(int year) {

            if (year < 1 || year > 9999) {
                return false;
            } else if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }

        public static int getDaysInMonth(int month, int year) {

            if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
                if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
                    return 31;
                } if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
                    return 30;
                } if ((month == 2) && (isLeapYear(year))) {
                    return 29;
                }
                return 28;
            }
            else {
                return -1;
        }
    }
}
