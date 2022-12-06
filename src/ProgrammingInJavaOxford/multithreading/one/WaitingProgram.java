package ProgrammingInJavaOxford.multithreading.one;

public class WaitingProgram
{
    public static void main(String[] args)
    {
        show();

        // without putting in try catch block ,
        // Thread.sleep() may throw
        // interrupted exception , thus program won't compile.
//        for(int i=0;i<10;i++)
//        {
//            System.out.print(".");
//            Thread.sleep(1000);
//        }


        System.out.println("\nBye");


    }

    public static void show()
    {
        System.out.print("Processing ");

        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.print(".");
                Thread.sleep(1000);
            }
        }

        catch(InterruptedException e)
        {
            System.out.println("main thread interrupted");
        }
    }

}

