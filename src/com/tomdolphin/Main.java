package com.tomdolphin;

public class Main {

    public static void main(String[] args) {
        area(2);
        area(2, 4);
    }

    public static double area(double radius) {
	    if(radius < 0){
	        return (int) -1.0;
        }
        double circleRadius = radius * radius * Math.PI;
	    return circleRadius;
    }

    public static double area(double x, double y) {
        if((x < 0) || (y < 0)) {
            return (int) -1.0;
        }
        double rectangleRadius = x * y;
        return rectangleRadius;
    }
}
