package java_sem3_assignments_OOPM.lab2;

import java.util.Scanner;

public class Launcher
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);  // sc is an object


        //part1
        System.out.println("For Calculating x^y : ");
        System.out.println("Enter the value of x :");
        double x = sc.nextDouble();
        System.out.println("Enter the value of y : ");
        double y = sc.nextDouble();
        double ans_power = MyMath.power(x,y);
        System.out.println("The ans is : "+ans_power);
        System.out.println("");


        //part2
        System.out.println("For Calculating factorial of x, Enter the value of x");
        int fact_me;
        fact_me = sc.nextInt();
        double ans_factorial = MyMath.factorial(fact_me);
        System.out.println("The factorial of given number is : "+ans_factorial);
        System.out.println("");


        //part3
        System.out.println("For 1st Exponential Series of e^x :\nenter value of 'x' ");
        double x1 = sc.nextDouble();
        System.out.println("Now enter the value of 'n'");
        int n1 = sc.nextInt();
        MyMath.calculateAndPrintExponentialSeries1(x1,n1);
        System.out.println("");


        //part4
        System.out.println("For 2nd Expansion Series of (1+x)^n : enter value of 'x' ");
        double x2 = sc.nextDouble();
        System.out.println("Now enter the value of 'n'");
        int n2 = sc.nextInt();
        MyMath.calculateAndPrintSeries2(x2,n2);
        System.out.println("");


    }
}
