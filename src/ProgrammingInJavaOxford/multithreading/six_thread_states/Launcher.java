package ProgrammingInJavaOxford.multithreading.six_thread_states;

public class Launcher
{
    public static void main(String[] args) throws InterruptedException {
        MyThread m1 = new MyThread();
        System.out.print("\nProcessing in Launcher ");
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getState());
        m1.t.join();

        for(int i=0;i<5;i++)
        {
            System.out.print("*");
        }
    }
}
