package ProgrammingInJavaOxford.multithreading.twelve_suspend_resume_threads;

public class SusResThread implements Runnable {
    String thread_name;
    Thread threadObject;
    boolean suspended;

    SusResThread() {
        thread_name = "Suspend Resume Thread";
        threadObject = new Thread(this, thread_name);
        suspended = false;
        threadObject.start();

    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread: " + i);
                Thread.sleep(200);
                synchronized (this) {
                    if (suspended) {
                        wait(); // Causes the current thread to wait until it is
                        // awakened, typically by being notified or interrupted.
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("thread interrupted.");
        }
        System.out.println("Exit from thread.");
    }

    public void suspendThread() {
        suspended = true;
    }

    synchronized public void resumeThread() {
        suspended = false;
        notify(); // Wakes up a single thread that is waiting on this object's monitor.
        // If any threads are waiting on this object, one of them is chosen to be awakened.
        // The choice is arbitrary.


        // notifyAll()  :
        // Wakes up all threads that are waiting on this object's monitor.
        // A thread waits on an object's monitor by calling one of the wait methods.
        //The awakened threads will not be able to proceed until the current thread
        // relinquishes the lock on this object. The awakened threads will compete in
        // the usual manner with any other threads that might be actively competing
        // to synchronize on this object

    }
}
