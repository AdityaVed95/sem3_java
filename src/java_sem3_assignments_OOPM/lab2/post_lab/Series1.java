package java_sem3_assignments_OOPM.lab2.post_lab;

import java.util.Scanner;

public class Series1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int i;
        double sum=0;
        for (i=1;i<=n;i++)
        {
            sum = sum + (1.0/i);
        }

        System.out.println("The sum of the series upto n terms is : "+sum);
    }
}
