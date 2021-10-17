package pt.com.heitor.saldanha;

public class Main {

    public static void main(String[] args) {

        double d = 20.00;
        double t = 80.00;
        double result = (d + t) * 100.00;
        double remainder = result % 30.00;
        String noRemainder = (remainder == 0) ? "There's no remainder" : "Got some remainder";
        System.out.println(noRemainder);

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        
        // TEST BRANCH

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was : " + finalScore);
        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was : " + finalScore);
        }

    }
}
