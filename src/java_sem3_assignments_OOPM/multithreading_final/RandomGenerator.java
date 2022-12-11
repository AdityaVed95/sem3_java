package java_sem3_assignments_OOPM.multithreading_final;


import java.util.Random;

public class RandomGenerator implements Runnable {
    RandomGenerator() {
        new Thread(this, "random").start();
    }

    @Override
    public void run() {

        while (true)
        {
            synchronized (Resource.vector1)
            {

                if (Resource.is_full == 0)
                {
                    Random rand = new Random();
                    int rand_int1 = rand.nextInt(30);
                    Resource.vector1.add(rand_int1);
                    System.out.println("Added number : " + rand_int1);
                    System.out.println("State of vector : " + Resource.vector1);
                    Resource.is_full = 1;
                    sleep();

                }
                else
                {
                    sleep();
                }

                // try removing sleep from within synchronised block and put a sleep outside synchronised block

            }

        }

    }

    static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
