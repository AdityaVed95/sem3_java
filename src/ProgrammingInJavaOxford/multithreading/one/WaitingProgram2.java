package ProgrammingInJavaOxford.multithreading.one;

public class WaitingProgram2
{
    public static void main(String[] args) throws InterruptedException
    {
        show();
        System.out.println("\nBye");
        // in this case the calling method and the called method : both need to have
        // "throws InterruptedException" in their method signature.

    }

    public static void show() throws InterruptedException
    {
        System.out.print("Processing ");

        for(int i=0;i<5;i++)
        {
            System.out.print(".");
            Thread.sleep(1000);
        }
    }
}
