package ProgrammingInJavaOxford.multithreading.five_isAlive_join;

public class CounterThread extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("In CounterThread : "+i);
        }
    }

}
