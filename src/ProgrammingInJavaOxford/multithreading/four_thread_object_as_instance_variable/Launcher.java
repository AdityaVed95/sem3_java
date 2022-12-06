package ProgrammingInJavaOxford.multithreading.four_thread_object_as_instance_variable;

public class Launcher
{
    public static void main(String[] args)
    {
        Counter counter1 = new Counter("Th1");
        counter1.thread1.start();

        for(int i=0;i<10;i++)
        {
            System.out.println("executing main thread : "+i);
        }
    }
}
