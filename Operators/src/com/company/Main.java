package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 =" + result);

        boolean isAlien = false;
        if (isAlien ==true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests are true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is an error!");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("this is not suppose to happen");

        boolean wasCar = isCar ? true : false;
        if(wasCar)
                System.out.println("wasCar is true");

        double value = 20;
        double secondValue = 80;
        int total = (double) (value + secondValue) * 25;
        int remainder = total % 3 / 40;
        if(remainder >= 20)
            System.out.println("Total was over the limit.");
    }
}
