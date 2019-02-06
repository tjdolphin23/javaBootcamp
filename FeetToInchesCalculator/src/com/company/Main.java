package com.company;

public class Main {

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
	    if(feet >= 0) {
	        return -1;
        } else if((inches >= 0) || (inches <= 12)) {
            return -1;
        } else if {
	        int inchTotal = feet / 12;
	        double total = (inches + inchTotal) * 2.54;
            System.out.println(total + "cm");
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if(inches >= 0) {
            return -1;
        } else if {
            System.out.println();
        }
    }
}
