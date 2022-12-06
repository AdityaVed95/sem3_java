package ProgrammingInJavaOxford.multithreading.eight;

public class MyThread extends Thread
{
    MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        int i=1;
        while (true)
        {
            System.out.println("Thread running "+i+" : name =  "+this.getName()+"   state = "+getState());

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Caught exception in "+getName()+"    state : "+getState());
            }

            i++;

        }

        // System.out.println("Exiting "+getName()+"   state : "+getState());
    }

}
