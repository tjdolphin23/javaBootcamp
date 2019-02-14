package com.tomdolphin;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int sum = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
            continue;
        }
            System.out.println("even number " + number);
        sum += 5;
    }

    public static int isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
