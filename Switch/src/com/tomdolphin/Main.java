package com.tomdolphin;

public class Main {

    public static void main(String[] args) {
//        int value = ;
//        if(value == 1){
//            System.out.println("value was 1");
//        } else if(value == 2) {
//            System.out.println("value was 2");
//        } else {
//            System.out.println("was not 1 or 2");
//        }

        char charValue = 'T';

        switch(charValue) {
            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println("B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Value was not A, B, C, D, or E");
                break;
        }
    }
}
