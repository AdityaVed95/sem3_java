package practice.multithreading.communication_between_threads;

public class Taker implements Runnable
{
    Carrier c;

    Taker(Carrier c)
    {
        this.c = c;
        new Thread(this,"Value Taker").start();
    }

    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                c.getValue();
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
