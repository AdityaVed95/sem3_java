package ProgrammingInJavaOxford.multithreading.five_isAlive_join;

public class Launcher2
{
    public static void main(String[] args)
    {
        CounterThread counterThread1 = new CounterThread();
        CounterThread counterThread2 = new CounterThread();
        counterThread1.start();
        counterThread2.start();
        System.out.println(counterThread1.isAlive());
        System.out.println(counterThread2.isAlive());

        try
        {
            counterThread1.join(); // complete the execution of thread1 :
            // completely execute the run method of thread1 and then only
            // move to the next line of code in the main thread
            counterThread2.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println(counterThread1.isAlive());
        System.out.println(counterThread2.isAlive());
    }

    // here different threads are sharing the same resource : that is the same output screen of the laptop
    // internally different threads might be getting seperate resource but when they are printed on the screen :
    // they cant be printed all at once
}
