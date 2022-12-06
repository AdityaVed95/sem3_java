package ProgrammingInJavaOxford.exceptions.one_implicit_exception;

public class SingleCatchClause
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
            System.out.println("Even these lines are not executed");
        }
        catch (Exception e) // exception object throw from the try block is caught in the catch block
        // the caught exception object is e
        // A superclass reference(Exception) variable can refer to a subclass object (e).
        {
            System.out.println("Exception handled in method 2 : "+e);

            // the exception can be handled only once in a given run, if it occurs again then
            // it is not handled , like if the below line is uncommented then the
            // ArithmeticException will occur and program will terminate
            // method3();

        }

        System.out.println("normal execution of method 2 continues");

    }

    public static void method3()
    {
        System.out.println("in method 3");
        System.out.println("now the exception will occur :");
        int x = 5/0;
        System.out.println("The statements after exception occurrence are not executed");
        // no exception handler present
    }
}
