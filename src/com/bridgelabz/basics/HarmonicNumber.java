package com.bridgelabz.basics;

import java.util.Scanner;

public class HarmonicNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        float sum=0;
        for(int i=1; i<=n;i++) {
            sum = sum + (1 / (float) i);
        }
        System.out.println("sum of harmonic number:" +sum);
       }
     }
