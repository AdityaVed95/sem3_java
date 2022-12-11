package practice.multithreading.assignment;

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
        Random rand = new Random();
        int rand_int1 = rand.nextInt(30);
        Resource.addAndRemove(rand_int1,"random");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
