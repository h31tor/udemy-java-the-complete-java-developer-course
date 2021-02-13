public class Challenge {
    public static void main(String[] args) {

        byte myByte = 8;
        short myShort = 16;
        int myInt = 32;
        long myLong = 50000 + (10 * (myByte + myShort + myInt));
        System.out.println(myLong);
    }
}
