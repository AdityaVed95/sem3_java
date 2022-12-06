package ProgrammingInJavaOxford.exceptions.one_implicit_exception;

public class SimpleSingleCath
{
    public static void main(String[] args)
    {
        try
        {
            int x = 5/0;
            // the code after which the exception occurred inside the try block never gets executed
            System.out.println("This never gets executed");
        }
        catch (Exception e)
        {
            System.out.println("Exception handled");
        }

        System.out.println("normal execution continues");
    }


}
