package com.bridgelabz.basics;

import java.util.Scanner;
public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1>n2&&n1>n3)
        {
            System.out.println("n1 is greater than n2 and n3");
        }
        else if(n2>n1&&n2>n3)
        {
            System.out.println("n2 is greater than n1 and n3");
        }
        else
        {
            System.out.println("n3 is greater than n1 and n2");
        }
    }

}
