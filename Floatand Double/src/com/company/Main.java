package com.company;

public class Main {

    public static void main(String[] args) {
	    int myInt = 5 / 3;
	    float myFloat = 5f / 3f;
	    double myDouble = 5d / 3d;

        System.out.println("MyIntValue = " + myInt);
        System.out.println("myFloatValue = " + myFloat);
        System.out.println("myDoubleValue = " + myDouble);

        double pounds = 5d;
        double kilo = 0.45359237d;
        System.out.println(pounds / kilo);
    }
}
