package ProgrammingInJavaOxford.multithreading.three;

public class Launcher
{
    public static void main(String[] args)
    {
        new CounterWithIntervalInThread(500);
        new CounterWithIntervalInThread(1000);


        // This generates error :
        // Thread t = new Thread(this,"Ex in main");
        System.out.println("Hello world->> Now Exiting !!");
    }
}
