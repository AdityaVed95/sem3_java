package ProgrammingInJavaOxford.multithreading.twelve_suspend_resume_threads;

public class Launcher
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("start : ");
//        Thread curr = Thread.currentThread();
//        curr.wait();

        SusResThread susResThreadObject = new SusResThread();
        try
        {
            Thread.sleep(1000);
            susResThreadObject.suspendThread();
            System.out.println("Thread has been suspended");
            Thread.sleep(1000);
            susResThreadObject.resumeThread();
            System.out.println("Thread has been resumed");
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

        try
        {
            susResThreadObject.threadObject.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

    }
}
