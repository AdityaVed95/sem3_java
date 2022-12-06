package ProgrammingInJavaOxford.multithreading.eight;

public class Launcher
{
    public static void main(String[] args)
    {
        System.out.println("in Main thread"+Thread.currentThread().getName()+"\n");


        MyThread mt1 = new MyThread("New Spawn Thread");
        System.out.println("Before calling start method of mt1   state : "+mt1.getState());

        mt1.start();
        System.out.println("After calling start method of mt1   state  : "+mt1.getState());
        System.out.println("Current State of mt1 is : "+ mt1.getState());
        mt1.interrupt();

        System.out.println("After interrupting mt1 thread");

        // we understand that interrupting a thread does not cause the thread to terminate.

    }
}
