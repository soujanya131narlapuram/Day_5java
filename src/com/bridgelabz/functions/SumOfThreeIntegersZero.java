package com.bridgelabz.functions;
public class SumOfThreeIntegersZero
{
    public static void sum_of_integers_zero() {

        int a[] = {-1, 2, 2, 2, -3, 0, 1, -2, 2};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; i < a.length; i++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        int sum = 0;
                        System.out.println("sum of a triplet that gives zero is: " + sum);
                        System.out.print("{");
                        System.out.print(a[i] + " ");
                        System.out.print(a[j] + " ");
                        System.out.print(a[k] + " ");
                        System.out.print("}");
                        System.out.println();
                    }
                }
            }
        }
    }
        public static void main(String[] args)
        {
            sum_of_integers_zero ();
        }
    }

