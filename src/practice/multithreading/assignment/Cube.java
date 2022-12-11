package practice.multithreading.assignment;

public class Cube  implements Runnable
{
    public Cube()
    {
        new Thread(this,"cu").start();
    }

    @Override
    public void run()
    {
        if(Resource.vector1.get(0) % 2 != 0)
        {

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
