package ProgrammingInJavaOxford.exceptions.two_explicitly_throwing_exception;

public class UsingThrowKeyword
{
    public static void main(String[] args)
    {
        System.out.println("in main method");
        method1();
        // no exception handler present

        System.out.println("normal execution of main method continues");

    }

    public static void method1()
    {
        System.out.println("in method 1 calling method 2");
        method2();
        System.out.println("normal execution of method 1 continues");
        // no exception handler present
    }
    public static void method2()
    {
        System.out.println("in method 2 calling method 3");

        // exception handler present
        try
        {
            method3();
        }

        catch (Exception e)
        {
            System.out.println("Exception handled : "+e);
        }


        System.out.println("normal execution of method 2 continues");

    }

    public static void method3()
    {
        System.out.println("in method 3");
        System.out.println("now the exception will occur :");
        // no exception handler present
        throw new NullPointerException("Testing explicit exception call");

        // the below line is unreachable statement , needs to be commented inorder to compile the program

        // System.out.println("The statements after exception occurrence are not executed");

    }
}
