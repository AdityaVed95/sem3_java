package java_sem3_assignments_OOPM.lab8;

public class SquareCalculate implements Runnable
{
    Carrier c;
    SquareCalculate(Carrier c)
    {
        this.c = c;
        new Thread(this,"Square calc").start();
    }


    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            if(c.communicatedValue %2 == 0)
            {
                int ans = (int) Math.pow(c.communicatedValue,2);
                System.out.println("Square of the number is : "+ans);
                try {
                    c.setBusy();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }



    }
}
