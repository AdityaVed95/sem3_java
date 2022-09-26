package java_sem3_assignments_OOPM.lab1.lab1_refactored;



import java.util.*; // importing all the classes in the util package
import java.lang.*;

public class MainLauncher2 extends ComplexCalculations2
{
    static Scanner sc = new Scanner(System.in);


    //static LinkedList<ComplexCalculations2> claculatorList = new LinkedList();


    public static void main(String[] args)
    {

        //claculatorList.forEach((temp)->System.out.println(temp.));

        double real1, imaginary1, real2, imaginary2;
        double[] array1;
        array1 = inputValues();

        real1 = array1[0];
        imaginary1 = array1[1];
        real2 = array1[2];
        imaginary2 = array1[3];


        int dummy = 1;
        String iterate_or_not = "y";

        while (dummy == 1)
        {
            System.out.println("Enter 1 to perform addition");
            System.out.println("Enter 2 to perform subtraction");
            System.out.println("Enter 3 to perform multiplication");
            System.out.println("Enter 4 to perform division");
            int response;
            response = sc.nextInt();
            sc.nextLine();

            switch (response) {
                case 1 -> add_caller_n_print_result(real1, real2, imaginary1, imaginary2);
                case 2 -> subtract_caller_n_print_result(real1, real2, imaginary1, imaginary2);
                case 3 -> multiply_caller_n_print_result(real1, real2, imaginary1, imaginary2);
                case 4 -> divide_caller_n_print_result(real1, real2, imaginary1, imaginary2);
                default -> System.out.println("Invalid input , please try again");
            }

            while (dummy == 1)
            {
                System.out.println("Enter y to display more calculations");
                System.out.println("Enter n to exit displaying calculations");
                iterate_or_not = sc.nextLine();
                //sc.nextLine();
                //java.io.OutputStream

                if(iterate_or_not.equals("Y") || iterate_or_not.equals("y"))
                {
                    break;
                }

                if(iterate_or_not.equals("n") || iterate_or_not.equals("N"))
                {
                    break;
                }

                else
                {
                    System.out.println("Invalid Input, Please Try again");
                }
            }


            if(iterate_or_not.equals("Y") || iterate_or_not.equals("y"))
            {
                continue;
            }

            if(iterate_or_not.equals("n") || iterate_or_not.equals("N"))
            {
                break;
            }


        }




    }

    public static double[] inputValues()
    {
        double real1, imaginary1, real2, imaginary2;

        System.out.println("Enter the real part of the 1st complex number");
        real1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the 1st complex number");
        imaginary1 = sc.nextDouble();

        System.out.println("Enter the real part of the 2nd complex number");
        real2 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the 2nd complex number");
        imaginary2 = sc.nextDouble();

        double[] array1 = {real1, imaginary1, real2, imaginary2};
        return array1;
    }

    public static void add_caller_n_print_result(double real1, double real2, double imaginary1, double imaginary2)
    {
        double [] array1 = ComplexCalculations2.addition(real1,imaginary1,real2,imaginary2);
        double sum_real = array1[0];
        double sum_imaginary = array1[1];

        System.out.println("The addition of 2 complex numbers is : "+sum_real+" + i("+sum_imaginary+")");

    }

    public static void subtract_caller_n_print_result(double real1, double real2, double imaginary1, double imaginary2)
    {
        double [] array1 = ComplexCalculations2.subtraction(real1,imaginary1,real2,imaginary2);
        double sum_real = array1[0];
        double sum_imaginary = array1[1];

        System.out.println("The subtraction of 2 complex numbers is : "+sum_real+" + i("+sum_imaginary+")");
    }

    public static void multiply_caller_n_print_result(double real1, double real2, double imaginary1, double imaginary2)
    {
        double [] array1 = ComplexCalculations2.multiply(real1,imaginary1,real2,imaginary2);
        double sum_real = array1[0];
        double sum_imaginary = array1[1];

        System.out.println("The multiplication of 2 complex numbers is : "+sum_real+" + i("+sum_imaginary+")");

    }

    public static void divide_caller_n_print_result(double real1, double real2, double imaginary1, double imaginary2)
    {
        double [] array1 = ComplexCalculations2.divide(real1,imaginary1,real2,imaginary2);
        double sum_real = array1[0];
        double sum_imaginary = array1[1];

        System.out.println("The division of 2 complex numbers is : "+sum_real+" + i("+sum_imaginary+")");
    }

}


