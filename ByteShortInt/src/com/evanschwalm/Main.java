package com.evanschwalm;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShort)

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        byte myByte = 100;
        short myShort = 10_000;
        int myInt = 100_000;

        long myLong = 50_000L + 10L * (myByte + myShort + myInt);
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));

        System.out.println(myLong);
        System.out.println(shortTotal);
    }
}
