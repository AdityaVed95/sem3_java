package ProgrammingInJavaOxford.exceptions.user_defined_exception;

public class UserDefinedException1 extends Exception
{
    UserDefinedException1(String msg)
    {
        super(msg);
    }

    public String toString()
    {
        return "UserDefinedException1 in thread main "+getMessage() ;

    }
}
