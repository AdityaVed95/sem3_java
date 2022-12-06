package ProgrammingInJavaOxford.exceptions.one_implicit_exception;

public class StackTraceOfExceptions
{
    public static void main(String[] args)
    {
        System.out.println("in main method");
        method1();
        // no exception handler present

        // now the default exception handler will catch the exception object
        // and print the message.
    }

    public static void method1()
    {
        System.out.println("in method 1");
        method2();
        // no exception handler present
    }
    public static void method2()
    {
        System.out.println("in method 2");
        method3();
        System.out.println("Even this statement does not get executed !!! ");
        // no exception handler present
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
