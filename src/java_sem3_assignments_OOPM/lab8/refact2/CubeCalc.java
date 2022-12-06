package java_sem3_assignments_OOPM.lab8.refact2;

public class CubeCalc implements Runnable
{
    CubeCalc()
    {
        new Thread(this,"cube").start();
    }
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Hello from CubeCalc");
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
