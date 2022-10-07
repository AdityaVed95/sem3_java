package test_concepts.strings;

public class CommandLineArguments
{
    public static void main(String[] args)
    {
        if(args.length == 0)
        {
            System.out.println("No command line arguments passed");
            return;
        }

        for (String arg : args)
        {
            System.out.println(arg);
        }

    }
}
