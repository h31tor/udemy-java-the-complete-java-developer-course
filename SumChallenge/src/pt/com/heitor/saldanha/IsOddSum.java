package pt.com.heitor.saldanha;

public class IsOddSum {
    public static void main(String[] args) {
        System.out.println(sumOdd(10, 5));
    }
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0 || end < start){
            return -1;
        }

        int sumOdd = 0;
        for (int i = start; i <= end; i++){
            if (isOdd(i)){
                sumOdd += i;
            }
        }
        return sumOdd;
    }
}