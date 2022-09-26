package java_sem3_assignments_OOPM.lab2.post_lab;

import java.util.Scanner;

public class Largest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number ");
        int num2 = sc.nextInt();

        System.out.println("Enter 3rd number ");
        int num3 = sc.nextInt();

        int max1 = num1>num2 ? num1 : num2;
        int max2 = max1>num3 ? max1 : num3;

        System.out.println("Max num is : "+max2);

    }
}
