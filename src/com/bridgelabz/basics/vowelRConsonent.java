package com.bridgelabz.basics;

import java.util.Scanner;

public class vowelRConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character :");
        char n = sc.next().charAt(0);
        if (n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
        {
            System.out.println("vowel ");
        } else {
            System.out.println("consonent");
        }
    }}
