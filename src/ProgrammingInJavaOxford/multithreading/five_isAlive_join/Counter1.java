package ProgrammingInJavaOxford.multithreading.five_isAlive_join;

public class Counter1 implements Runnable
{
    Counter1(String name)
    {
        Thread t = new Thread(this,name);
        t.start();
    }


    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("In counter1 : "+i);
        }
    }
}
