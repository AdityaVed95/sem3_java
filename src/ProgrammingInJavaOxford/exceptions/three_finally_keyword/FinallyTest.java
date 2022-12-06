package ProgrammingInJavaOxford.exceptions.three_finally_keyword;

public class FinallyTest
{
    public static void main(String[] args)
    {
        try
        {
            //throw new Exception("test throw");
        }
        catch (Exception e)
        {
            System.out.println("Exception handled");
        }
        finally
        {
            System.out.println("I get executed irrespective of occurence of exception");
        }
    }
}
