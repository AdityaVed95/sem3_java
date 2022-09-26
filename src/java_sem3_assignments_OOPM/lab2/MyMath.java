package java_sem3_assignments_OOPM.lab2;

import java.util.Scanner;

public class MyMath
{

    public static double power(double base, double power)
    {
        // to compute base^power
        double ans=1;
        int i;
        for(i=1;i<=power;i++)
        {
            ans = ans*base;
        }

        return ans;

    }

    public static long factorial(int num)
    {

        if (num == 0)
        {
            return 1;
        }

        int i;
        long product=1;

        for(i=1;i<=num;i++)
        {
            product = product*i;
        }

        return product;
    }

    public static void calculateAndPrintExponentialSeries1(double x,int n)
    {
        int i;
        double sum=0;
        for(i=0;i<n;i++)
        {
            sum = sum + (power(x,i)/factorial(i));
        }

        System.out.println("The value of the series is : "+sum);
    }

    public static void calculateAndPrintSeries2(double x, int n)
    {
        int i;
        double sum=0;
        double product =1;

        for(i=0;i<n;i++)
        {
            sum = sum + ( (power(x,i) / factorial(i) )  * product  );
            product = product*(n-i);
        }
        System.out.println("The value of the series is : "+sum);
    }

}
