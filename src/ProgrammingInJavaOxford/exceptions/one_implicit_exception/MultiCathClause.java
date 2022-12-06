package ProgrammingInJavaOxford.exceptions.one_implicit_exception;

public class MultiCathClause
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



        catch (ArithmeticException ae)
        {
            System.out.println("Exception handled in method 2");
        }

        catch (Exception e)
        {
            System.out.println("Exception handled");
        }

        // if the Exception block would be above ArithmeticException block
        // then compiler generates error saying exception has been already caught
        // and also the ArithmeticException will become unreachable code.

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
