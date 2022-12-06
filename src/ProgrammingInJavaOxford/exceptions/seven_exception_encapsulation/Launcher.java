package ProgrammingInJavaOxford.exceptions.seven_exception_encapsulation;

import ProgrammingInJavaOxford.exceptions.six_user_defined_exception.MyNewException;

public class Launcher
{
    public static void main(String[] args) throws MyNewException
    {
        try
        {
            method1();
        }
        catch (InstantiationException e)
        {
            throw new MyNewException("Wrapped instantiation exception inside My new exception ");

        }
    }

    public static void method1() throws InstantiationException
    {
        throw new InstantiationException("Testing Throw");
    }
}
