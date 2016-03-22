package com.lessons.strings;

/**
 * Created by dennis on 3/22/16.
 */
public class StringAddDemo {

    public static void main(String[] args) {
        //intPrintln();
        //stringPrintln();
        mixedPrintln();
    }

    private static void stringPrintln() {
        String age = "12";
        String age2 = "14";
        String age3 = "7";
        String baby = "3";
        System.out.println(age + (age2 + age3) + baby);
    }

    private static void intPrintln() {
        int age = 12;
        int age2 = 14;
        int age3 = 7;
        short baby = 3;
        System.out.println(age + (age2 + age3) + baby);
    }

    private static void mixedPrintln() {
        String age = "12";
        int age2 = 14;
        String age3 = "7";
        String baby = "3";
        System.out.println(age + (age2 + age3) + baby);
    }
}
