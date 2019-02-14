package com.tomdolphin;

public class Main {

    public static void main(String[] args) {
	isPalindrome(1221);
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int originalnumber=number;
        while (number !=0) {

            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number / 10;
        }
        System.out.println(reverse);
        System.out.println(originalnumber);

        if (reverse == originalnumber) {
            return true;
        }return false;


    }
}
