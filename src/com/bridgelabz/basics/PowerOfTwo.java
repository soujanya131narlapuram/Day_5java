package com.bridgelabz.basics;
import java.lang.Math;
//import java.util.Scanner;

public class PowerOfTwo {

    public static double function(int n) {
        double Power_two = (int) Math.pow(2, n);
        System.out.println("power of 2 :" + Power_two);
        return 0.0;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("finding the 2 power value :");
        function(2);

    }
}
