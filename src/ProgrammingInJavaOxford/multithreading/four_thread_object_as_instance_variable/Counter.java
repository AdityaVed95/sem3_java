package ProgrammingInJavaOxford.multithreading.four_thread_object_as_instance_variable;

public class Counter implements Runnable
{
    Thread thread1; // this is not how its generally done.
    // this is just for experimentation purpose

    Counter(String name)
    {
        thread1 = new Thread(this,name);
    }


    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("executing thread1 : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
