package com.bridgelabz.basics;
import java.util.Scanner;

public class PrimeFactors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int is_prime=0;
        //float sum=0;
        for(int i=1; i<=(n/2);i++) {
            if (n%i ==0) {
                is_prime=prime_num(i);
                if(is_prime==1) {
                    System.out.println(i + " is the prime factor for " + n);
                }
            }
        }
    }
    public  static int prime_num(int num){
        int k=0;
        for (int j=1;j*j<=num;j++){
            if (num%j ==0){
                k++;
            }
        }
        if (k==1){
            return 1;
        }
        else {
            return 0;
        }
    }
}
