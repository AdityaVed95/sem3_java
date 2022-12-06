package ProgrammingInJavaOxford.multithreading.fifteen_clock_example;

public class Minutes implements Runnable
{
    int minute;

    Minutes()
    {
        minute = 0;
        new Thread(this,"sec").start();
    }

    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("minute :"+minute);
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            minute++;
        }
    }
}
