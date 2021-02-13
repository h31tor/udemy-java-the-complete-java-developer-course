package pt.com.heitor.saldanha;

public class Main {

    public static void main(String[] args) {
        int superbock = 10;
        int sagres = 9;
        for (int i = 1; i <= superbock; i++) {
            if (i%2 == 0) {
                System.out.println("Sport Campeão! "+i);

            } else if (i == sagres) {
                System.out.println("Náutico é Barbie! "+i);
            } else {
                System.out.println("Santa é Série C! "+i);
            }

        }
    }

}




