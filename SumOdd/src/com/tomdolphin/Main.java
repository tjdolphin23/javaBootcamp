package com.tomdolphin;

public class Main {

    public static void main(String[] args) {
    }

    public static boolean isOdd(int number) {
        if((number > 0) && (number % 2 != 0)) {
            return true;
        }
            return false;
        }

    public static int sumOdd(int start, int end) {

        if ((start < 0) || (end < 0)) {
            return -1;
        } else if (start > end) {
            return -1;
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                isOdd(i);
                sum += i;
            }


        }

}
