package com.bridgelabz.basics;

import java.util.Scanner;

public class Swap2Numbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the numbers :");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int t = n;
            n = m;
            m = t;
            System.out.println(" the numbers after swapping n :" + n );
            System.out.println(" the numbers after swapping m :" + m);
        }
    }
