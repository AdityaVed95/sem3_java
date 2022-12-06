package java_sem3_assignments_OOPM.lab8;

import java.util.Random;

public class RandomGenerate implements Runnable
{
    Carrier c;

    RandomGenerate(Carrier c)
    {
        this.c = c;
        new Thread(this,"Random").start();
    }
    @Override
    public void run()
    {
        int i = 0;
        while(i<5)
        {

            Random rand = new Random();
            int rand_int1 = rand.nextInt(30);
            c.setValue(rand_int1);

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }

            i++;

        }


    }
}
