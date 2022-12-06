package ProgrammingInJavaOxford.exceptions.three_finally_keyword;

public class FinallyWithoutCatch
{

    public static void main(String args[])
    {
        method1();
        System.out.println("Result : " + method2(24, 3));
        System.out.println("Result : " + method2(24, 0));
    }


    // this method has try, catch, finally
    public static void method1()
    {
        try
        {
            System.out.println("IN Method 1");
            throw new NullPointerException();
        }
        catch (Exception e)
        {
            System.out.println("Exception Handled: " + e);
        }
        finally
        {
            System.out.println("In method 1 finally");
        }
    }


    // this method has try, finally
    public static int method2(int a, int b)
    {
        try
        {
            System.out.println("IN Method 2");
            return a / b;
        }
        finally
        {
            System.out.println("In method 2 finally");
        }

    }
}

