package java_sem3_assignments_OOPM.lab8.assignment_main_using_vectors;

import java.util.*;

public class RandomGenerator implements Runnable
{
    RandomGenerator()
    {
        new Thread(this,"random").start();
    }

    @Override
    public void run()
    {
        while (true)
        {
            if(Resource.is_full == 0)
            {
                Random rand = new Random();
                int rand_int1 = rand.nextInt(30);
                Resource.vector1.add(rand_int1);
                System.out.println("Added number : "+rand_int1);
                System.out.println("State of vector : "+Resource.vector1);
                Resource.is_full = 1;
                sleep();

            }
            else
            {
                sleep();
            }
        }

    }

    static void sleep()
    {
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
