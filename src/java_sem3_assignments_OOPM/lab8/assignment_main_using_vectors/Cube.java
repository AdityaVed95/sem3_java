package java_sem3_assignments_OOPM.lab8.assignment_main_using_vectors;

public class Cube  implements Runnable
{
    public Cube()
    {
        new Thread(this,"cu").start();
    }

    @Override
    public void run()
    {
        while(true)
        {
            if(Resource.is_full == 1)
            {
                int num = Resource.vector1.get(0);
                if(num % 2 != 0)
                {

                    System.out.println("Odd number found : "+num);
                    System.out.println("Cube is : "+num*num*num+"\n\n");
                    Resource.vector1.remove(0);
                    Resource.is_full = 0;
                }
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
