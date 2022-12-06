package ProgrammingInJavaOxford.exceptions.two_explicitly_throwing_exception;

public class ThrowsIsNotSubstituteToTryCatch
{
    public static void main(String[] args)
    {
        method1();
        System.out.println("main ends");
    }

    public static void method1() throws ArithmeticException
    {
        System.out.println("in method 1");
        int a = 5/0;
    }

    // we cannot use throws as a substitute to try catch
    // if we use only throws instead of try catch then the
    // exception will occur, and it will be handled by
    // the default exception handler



}
