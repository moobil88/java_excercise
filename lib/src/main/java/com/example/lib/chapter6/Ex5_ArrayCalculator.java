package com.example.lib.chapter6;

public class Ex5_ArrayCalculator {


    public static int sum(int[] x)
    {
        int sum=0;
        for(int i=0; i<x.length; i++ )
        {
            sum = sum + x[i];
        }

        return sum;
    }

    public static float avg(int[] x)
    {
        float sum = sum(x);
        return sum / x.length;
    }

}
