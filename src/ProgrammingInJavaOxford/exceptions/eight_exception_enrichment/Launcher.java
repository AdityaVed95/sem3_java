package ProgrammingInJavaOxford.exceptions.eight_exception_enrichment;

public class Launcher
{
    public static void main(String[] args)
    {
        try
        {
            method1();
        }
        catch (MyNewException2 e)
        {
            System.out.println(e);
        }
    }

    public static void method1() throws MyNewException2
    {
        try
        {
            throw new MyNewException2("Testing user defined exceptions");
        }
        catch (MyNewException2 e)
        {
            e.addInformation("Adding info");
            throw e;
        }
    }
}
