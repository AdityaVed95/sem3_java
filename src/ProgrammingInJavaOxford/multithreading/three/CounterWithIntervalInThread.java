package ProgrammingInJavaOxford.multithreading.three;

// Creating a Thread Using Runnable Interface

public class CounterWithIntervalInThread implements Runnable
{
    int sleep_time_in_milliseconds;

    CounterWithIntervalInThread(int sleep_time_in_milliseconds)
    {
        Thread t = new Thread(this,"Example thread"); // implementing thread
        System.out.println("Detail of child thread : "+t);
        this.sleep_time_in_milliseconds= sleep_time_in_milliseconds;
        t.start();

    }

    public void run()
    {
        try
        {
            for(int i = 1; i<= 500000; i++)
            {
                System.out.println("\tFrom CounterWithIntervalInThread with sleep interval = "+ sleep_time_in_milliseconds +" : count value i = " +i);
                Thread.sleep(sleep_time_in_milliseconds);
            }
        }

        catch(InterruptedException e)
        {
            System.out.println("child Thread 1 interrupted");
        }

        System.out.println("Exit from child Thread 1");

    }
}
