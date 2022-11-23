package com.bridgelabz.basics;

//import java.util.Scanner;

public class LeapYear {
    public static void leap_or_not(int year) {
        System.out.println("finding  the year is leap or not:");
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("leap  year ");
        } else {
            System.out.println("not leap  year ");
        }
    }
        public static void main(String[] args) {
            leap_or_not(1900);
        }
    }

