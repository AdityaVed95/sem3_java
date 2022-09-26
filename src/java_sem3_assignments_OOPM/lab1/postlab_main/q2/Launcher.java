package java_sem3_assignments_OOPM.lab1.postlab_main.q2;

import java.util.Scanner;

public class Launcher
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number :");
        int num2 = sc.nextInt();

        int gcd_result = gcd(num1,num2);
        System.out.println("GCD is : "+gcd_result);

    }
    public static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
}
