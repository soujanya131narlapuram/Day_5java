package com.bridgelabz.basics;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int remainder=n%10;
        int quotient=n/10;
        System.out.println("remainder value:"+remainder);
        System.out.println("quotient value:"+quotient);
    }
}
