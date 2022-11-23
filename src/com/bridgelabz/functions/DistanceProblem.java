package com.bridgelabz.functions;
import java.util.Scanner;

public class DistanceProblem {
    public static void finding_distance(int x,int y)
    {
        System.out.println("distance between the x,y points:");
        int first = x * x;
        int second = y * y;
        double sum = first + second;
        double distance = Math.sqrt(sum);
        System.out.println("distance:" + distance);
    }

    public static void main(String[] args) {
        finding_distance(20,30);
    }
}

