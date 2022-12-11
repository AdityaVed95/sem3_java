package java_sem3_assignments_OOPM.lab8.refact4;


import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;

public class RandomGenerate implements Runnable
{
    List list;

    RandomGenerate(List list)
    {
        this.list = list;
        new Thread(this,"random").start();
    }

    @Override
    public void run()
    {
        while(true)
        {
            Random rand = new Random();
            int rand_int1 = rand.nextInt(30);
            list.add(rand_int1);
            System.out.println("Adding : "+rand_int1);
            System.out.println("After Adding : "+list);

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }


    }
}
