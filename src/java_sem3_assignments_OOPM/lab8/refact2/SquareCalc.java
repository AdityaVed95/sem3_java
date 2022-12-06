package java_sem3_assignments_OOPM.lab8.refact2;

public class SquareCalc implements Runnable
{
    SquareCalc()
    {
        new Thread(this,"square").start();
    }
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Hello from SquareCalc");
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
