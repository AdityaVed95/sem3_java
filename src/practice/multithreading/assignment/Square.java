package practice.multithreading.assignment;

public class Square implements Runnable
{
    public Square()
    {
        new Thread(this,"sq").start();
    }

    @Override
    public void run()
    {
        Resource.addAndRemove(0,"sq");// here 0 is give not for actual insertion , it is just a random num

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
