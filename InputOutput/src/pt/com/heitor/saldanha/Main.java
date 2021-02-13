package pt.com.heitor.saldanha;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myString = scan.next();
        int myInt = scan.nextInt();
        scan.close();
        for (int x = 1; x <= 3; x++) {
            int a = scan.nextInt();

            System.out.println(x + myString);
            System.out.println(a + myInt);
        }
    }
}





