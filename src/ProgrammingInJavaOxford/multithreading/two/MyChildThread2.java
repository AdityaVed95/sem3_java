package ProgrammingInJavaOxford.multithreading.two;

public class MyChildThread2 extends Thread
{
    @Override
    public void run()
    {
        try
        {
            for(int j = 1;j<=5;j++)
            {
                System.out.println("From MyChildThread2 : j = "+j);
                Thread.sleep(0);
                // the above line has to be handled by a try catch block compulsorily
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("MyChildThread2 got interrupted");
        }
    }
}
