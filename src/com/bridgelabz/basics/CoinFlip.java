package com.bridgelabz.basics;
import java.util.Scanner;
public class CoinFlip {
//        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
    public static void head_vs_tails(int n)
    {
        double RandomCheck;
        int count_head = 0;
        int count_tails = 0;
        for (int i = 0; i < n; i++) {
            RandomCheck = Math.random();
            if (RandomCheck < 0.5) {
                System.out.println("tails");
                count_tails++;

            } else {
                System.out.println("heads");
                count_head++;
            }
        }
        double percentage_heads = (count_head * 100) / n;
        double percentage_tails = (count_tails * 100) / n;
        System.out.println("percentage of heads:" + percentage_heads);
        System.out.println("percentage of tails:" + percentage_tails);
    }

    public static void main(String[] args) {
        System.out.println(" flip the coin:");
        head_vs_tails(5);
    }
}

