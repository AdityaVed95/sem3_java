package java_sem3_assignments_OOPM.lab8.refact2;

public class RandomGenerator implements Runnable
{
    RandomGenerator()
    {
        new Thread(this,"random").start();
    }

    @Override
    public void run()
    {

        while(true)
        {
            System.out.println("Hello from RandomGenerator");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }

    }
}
