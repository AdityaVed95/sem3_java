package ProgrammingInJavaOxford.multithreading.fifteen_clock_example;

public class Hours implements Runnable
{
    int hour;

    Hours()
    {
        hour = 0;
        new Thread(this,"sec").start();
    }

    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("hour : "+hour);
            try {
                Thread.sleep(3600000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hour++;
        }
    }
}
