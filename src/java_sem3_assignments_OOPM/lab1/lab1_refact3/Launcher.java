package java_sem3_assignments_OOPM.lab1.lab1_refact3;

import java.util.Scanner;

public class Launcher
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real part of 1st number");
        double real1 = sc.nextDouble();

        System.out.println("Enter imaginary part of 1st number");
        double imaginary1 = sc.nextDouble();

        System.out.println("Enter real part of 2nd number");
        double real2 = sc.nextDouble();

        System.out.println("Enter imaginary part of 2nd number");
        double imaginary2 = sc.nextDouble();

        Complex3 number1 = new Complex3(real1,imaginary1);
        Complex3 number2 = new Complex3(real2,imaginary2);

        Complex3 number_sum = new Complex3();
        Complex3 number_multiplied = new Complex3();

        int dummy = 0;

        while(dummy == 0)
        {
            System.out.println("Enter 1 to add and display");
            System.out.println("Enter 2 to subtract and display");
            System.out.println("Enter 3 to multiply and display");
            System.out.println("Enter 4 to divide and display");
            System.out.println("Enter 5 to end the program");
            int response = sc.nextInt();

            if (response == 1)
            {
                number_sum.add(number1,number2);
                Complex3.display_cui(number_sum);
            }

            else if (response == 2)
            {
                Complex3 difference = new Complex3();
                difference = Complex3.subtract(number1,number2);
                Complex3.display_cui(difference);

            }

            else if(response == 3)
            {
                number_multiplied.multiply(number1,number2);
                Complex3.display_cui(number_multiplied);
            }

            else if(response == 4)
            {
                Complex3 divided = new Complex3();
                divided = Complex3.divide(number1,number2);
                Complex3.display_cui(divided);
            }

            else if(response == 5)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input try again later");
            }
        }

    }
}
