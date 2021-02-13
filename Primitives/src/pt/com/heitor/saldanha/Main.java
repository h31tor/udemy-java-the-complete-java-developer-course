package pt.com.heitor.saldanha;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myIntMinValue = Integer.MIN_VALUE;
        int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("Int Min = " + myIntMinValue);
        System.out.println("Int Max = " + myIntMaxValue);
        System.out.println("Busted MAX = " + (myIntMaxValue + 1));
        System.out.println("Busted MIN = " + (myIntMinValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min = " + myMinByteValue);
        System.out.println("Byte Max = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min = " + myMinShortValue);
        System.out.println("Short Max = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min = " + myMinLongValue);
        System.out.println("Long Max = " + myMaxLongValue);

        long myLongValue = 100;
        short bigShort = 32767;

        int myTotal = (myIntMinValue / 2);
        byte meNewByte = (byte) (myMinByteValue / 2);
        short myNewShort = (short) (myMinShortValue / 2);
    }
}
