package java_sem3_assignments_OOPM.lab8.refact4;

import java.util.List;

public class Cube implements Runnable
{
    List list;

    Cube(List list)
    {
        this.list = list;
        new Thread(this,"cu").start();
    }

    @Override
    public void run()
    {
        int num = (int) list.get(0);

        if(num % 2 != 0 )
        {
            System.out.println("Odd Number Added : "+num);
            list.remove(0);
        }

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }
}
