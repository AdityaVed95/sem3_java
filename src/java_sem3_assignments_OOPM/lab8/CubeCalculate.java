package java_sem3_assignments_OOPM.lab8;

public class CubeCalculate implements Runnable
{
    Carrier c;
    CubeCalculate(Carrier c)
    {
        this.c = c;
        new Thread(this,"Cube calc").start();
    }

    @Override
    public void run()
    {

        for(int i=0;i<5;i++)
        {
            if(c.communicatedValue % 2 != 0)
            {
                int ans = (int) Math.pow(c.communicatedValue,3);
                System.out.println("Cube of the number : "+ans);
                try {
                    c.setBusy();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }



    }
}
