package practice.multithreading.communication_between_threads;

public class Giver implements Runnable
{
    Carrier c;

    Giver(Carrier c)
    {
        this.c = c;
        new Thread(this,"Value Giver").start();
    }

    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                c.putValue(i);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
