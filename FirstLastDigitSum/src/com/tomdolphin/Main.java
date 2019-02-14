package com.tomdolphin;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(125));
    }

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = number % 10;
        int firstDigit = number;

        while(firstDigit>=10)
        {
            firstDigit /= 10;
        }
        if(firstDigit+lastDigit<0)
        {
            return -1;
        }
        return firstDigit + lastDigit;
    }
}

