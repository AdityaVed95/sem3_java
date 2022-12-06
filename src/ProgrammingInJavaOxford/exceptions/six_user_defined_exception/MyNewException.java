package ProgrammingInJavaOxford.exceptions.six_user_defined_exception;

public class MyNewException extends Exception
{
    public MyNewException(String msg)
    {
        super(msg);
    }

    public String toString()
    {
        return "Exception in thread main : "+getMessage();
    }

}
