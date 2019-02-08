package com.tomdolphin;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long mins) {
        if(mins < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = mins / 525600;
            long remainingMinutes = mins % 525600;
            long days = remainingMinutes / 1440;
            ;
            System.out.println(mins + " min = " + years + " y and " + days + " d");
        }
    }
}
