package ProgrammingInJavaOxford.exceptions.six_user_defined_exception;

import java.io.IOException;

public class Test1
{
    public static void main(String[] args)
    {
        method1();
        System.out.println("exit");
    }

    public static void method1()
    {
        try
        {
            System.out.println("in try");
            int x = 5/0;
            System.out.println("You cant print me");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        System.out.println("me too!!");
    }
}
