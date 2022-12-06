package ProgrammingInJavaOxford.multithreading.eleven_synchronise_method;

public class MyThread extends Thread
{
    String thread_name;
    MyThread(String thread_name)
    {
        this.thread_name = thread_name;
    }
    @Override
    public void run()
    {
        TestSynchronise.anyMethod(thread_name);
    }
}
