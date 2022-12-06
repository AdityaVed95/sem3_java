package ProgrammingInJavaOxford.multithreading.two;

public class Launcher2
{
    public static void main(String[] args)
    {
        MyChildThread1 thread1 = new MyChildThread1();
        MyChildThread2 thread2= new MyChildThread2();
        thread1.setPriority(1);
        thread2.setPriority(10);
        thread1.start();
        thread2.start();
    }
}
