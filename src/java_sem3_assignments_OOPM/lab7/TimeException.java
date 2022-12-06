package java_sem3_assignments_OOPM.lab7;

public class TimeException extends Exception
{
    TimeException(String msg)
    {
        super(msg);
    }

    public String toString()
    {
        return "Exception in thread main : "+getMessage();
    }
}
