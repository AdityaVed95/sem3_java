package ProgrammingInJavaOxford.multithreading.six_thread_states;

public class MyThread implements Runnable
{
    Thread t;
    MyThread()
    {
        t = new Thread(this,"Example Thread");
        t.start();
    }

    @Override
    public void run()
    {
        System.out.print("Processing in Mythread ");
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.print(".");
                System.out.println(t.getState());
                Thread.sleep(1000);

            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
