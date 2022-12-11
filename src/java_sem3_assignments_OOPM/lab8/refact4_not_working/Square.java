package java_sem3_assignments_OOPM.lab8.refact4_not_working;

import java.util.List;

public class Square implements Runnable
{

    List list;

    Square(List list)
    {
        this.list = list;
        new Thread(this,"sq").start();
    }

    @Override
    public void run()
    {
        int num = (int) list.get(0);

        if(num % 2 == 0 )
        {
            System.out.println("Even Number Added : "+num);
            list.remove(0);
        }

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }


}
