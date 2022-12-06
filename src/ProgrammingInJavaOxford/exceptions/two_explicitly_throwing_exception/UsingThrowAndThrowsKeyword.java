package ProgrammingInJavaOxford.exceptions.two_explicitly_throwing_exception;

public class UsingThrowAndThrowsKeyword
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
        method3();

        System.out.println("normal execution of method 2 continues");

    }

    public static void method3() throws ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException
    {
        // The throws is added to the method signature to let the caller of this method know about what
        // exceptions the called method may throw.
        // So that the caller method can prepare for catching the exception thrown by this method
        // thus it indicates that this method may throw an exception which the caller should handle
        // and that the exception will not be handled inside that given method.

        // the throws followed by Exception name might be misleading at times
        // the method might throw a different exception which might not even be mentioned in the list
        // thus it is just for guidance, cant rely on it 100%



        System.out.println("in method 3");
        System.out.println("now the exception will occur :");
        // no exception handler present
        throw new NullPointerException("Testing explicit exception call");

    }
}
