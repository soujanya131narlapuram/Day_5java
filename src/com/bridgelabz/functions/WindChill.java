 package com.bridgelabz.functions;
//import java.util.Scanner;
public class WindChill {
    public static void m1(double t,double v){
         System.out.println(" wind chill program :");
         double s = Math.pow(v, 0.16);
         double w = (35.74 + 0.6215) * t + ((0.4275) * t - (35.75)) * s;
        System.out.println(w);
     }
         public static void main(String[] args){
             m1(2,5);

}}