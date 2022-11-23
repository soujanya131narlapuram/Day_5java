package com.bridgelabz.functions;
import java.util.Scanner;
public class TwoDArray
{
    public static int integers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the m rows ,n columns :");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("enter the elements to store:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                System.out.println("elements:"+arr[i][j]);
            }}
        System.out.println();
        return 0;
    }

   public static double double_method() {

        Scanner sc = new Scanner(System.in);
       System.out.println("enter the m rows ,n columns :");
       int m=sc.nextInt();
       int n=sc.nextInt();
        double arr[][] = new double[m][n];
        System.out.println("enter the elements to store:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                 arr[i][j] = sc.nextDouble();
               //System.out.print(arr[i][j] = sc.nextDouble());
            }
            //System.out.println();
        }
        System.out.println("2D array elements are");
        for (double[] row_arr:arr){           //row_arr stores the array elements of one row for each time.
            for(double element:row_arr){        //element stores the each element in array
                System.out.print(element+" ");
            }
            System.out.println();
        }
            return 0.0;
    }

    public static boolean boolean_method()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the m rows ,n columns :");
        int m=sc.nextInt();
        int n=sc.nextInt();
        boolean arr[][] = new boolean[m][n];
        System.out.println("enter the elements to store:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextBoolean();
                     System.out.println(arr[i][j]);
            }}
        System.out.println();
        return true;
    }

    public static void main(String[] args){
//  integers();
//  double_method();
  boolean_method();
    }
}
