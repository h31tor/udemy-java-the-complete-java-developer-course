package pt.com.heitor.saldanha;

public class Main {

    public static void main(String[] args) {


        for (double interestRate = 1; interestRate <= 10; interestRate++) {
            System.out.println("10.000 at " + interestRate + "% interest = " + (10000 + calculateInterest(10000, interestRate)));
        }
        int count = 0;
        for (int prime = 2; prime <=99; prime++) {
            if (isPrime(prime)) {
                count++;
                System.out.println(prime + " is a prime number!");
                if (count == 10) {
                    System.out.println("10 prime numbers reached.");
                    break;
                }
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate/100));
    }
    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
