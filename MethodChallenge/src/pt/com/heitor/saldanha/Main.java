package pt.com.heitor.saldanha;

public class Main {

    public static void main(String[] args) {

        String name = "Heitor";
        int score = calculateHighScorePosition(1500);
        displayHighScorePosition(name, score);
        score = calculateHighScorePosition(900);
        displayHighScorePosition(name, score);
        score = calculateHighScorePosition(400);
        displayHighScorePosition(name, score);
        score = calculateHighScorePosition(50);
        displayHighScorePosition(name, score);

    }

    public static void displayHighScorePosition(String name, int score) {

        System.out.println(name + " managed to get into score " + score + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

        Math.round()
    }
}
