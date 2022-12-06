package ProgrammingInJavaOxford.multithreading.two;

public class Launcher
{
    public static void main(String[] args)
    {
        MyChildThread1 thread1 = new MyChildThread1();
        System.out.println("state of thread before calling start method of the thread "+thread1.getState());
        thread1.start();
        System.out.println("state of thread after calling start method of the thread "+thread1.getState());

        for(int k=1;k<=5;k++)
        {
            System.out.println("In main thread : k = "+k);
        }

    }
}
