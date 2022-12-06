package ProgrammingInJavaOxford.multithreading.two;

// Creating a Thread Using the Thread Class

public class MyChildThread1 extends Thread // inheriting thread
{

    MyChildThread1()
    {
        super();
    }

    @Override
    public void run()
    {
        try
        {
            for(int i = 1;i<=5;i++)
            {
                System.out.println("From MyChildThread1 : i = "+i);
                Thread.sleep(0);
                // the above line has to be handled by a try catch block compulsorily
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("MyChildThread1 got interrupted");
        }
    }
}
