package ProgrammingInJavaOxford.multithreading.two;

public class Launcher3
{
    public static void main(String[] args)
    {
        MyChildThread2 thread2 = new MyChildThread2();
        thread2.run();
        thread2.start();
        System.out.println("end main thread here");
        // note the difference between thread2.run() and thread2.start()
        // when we do thread2.run() it is like a function call and after the
        // execution of run() function , the execution in the
        // main function(main thread) continues

        // and if we use thread2.start() : the execution of main fxn and the
        // run() fxn happens parallely

    }
}
