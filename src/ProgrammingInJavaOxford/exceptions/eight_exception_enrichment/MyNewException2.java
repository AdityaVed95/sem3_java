package ProgrammingInJavaOxford.exceptions.eight_exception_enrichment;

public class MyNewException2 extends Exception
{
    String message;

    MyNewException2(String msg)
    {
        message = msg;
    }

    public String toString()
    {
        return "Exception in thread main : "+message;
    }

    public void addInformation(String addMsg)
    {
        message = message + " : " +addMsg;
    }
}
