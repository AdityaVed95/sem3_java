package java_sem3_assignments_OOPM.lab8.refact3;

import java.io.IOException;
import java.util.Random;
import java.io.FileWriter;

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
            Random rand = new Random();
            int rand_int1 = rand.nextInt(30);
            String put = String.valueOf(rand_int1);


            try
            {
                FileWriter Writer = new FileWriter("src/java_sem3_assignments_OOPM/lab8/refact3/new2.txt");
                Writer.write(put);
                Writer.close();

            }
            catch (IOException e)
            {
                System.out.println("An error has occurred.");
                e.printStackTrace();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

