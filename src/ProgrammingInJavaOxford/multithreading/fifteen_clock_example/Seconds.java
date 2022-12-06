package ProgrammingInJavaOxford.multithreading.fifteen_clock_example;

public class Seconds implements Runnable
{
    int second;

    Seconds()
    {
        second = 0;
        new Thread(this,"sec").start();
    }

    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("second : "+second);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            second++;
        }
    }
}
