package ProgrammingInJavaOxford.multithreading.ten_isAlive_join;

import org.jetbrains.annotations.NotNull;

class ThreadJoin implements Runnable {
    String thread_name;
    Thread thread_object;

    ThreadJoin(String threadName) {
        thread_name = threadName;
        thread_object = new Thread(this, thread_name);
        thread_object.start();
    }

    public void run() {
        try {
            Thread.sleep(2000);
            for (int i = 1; i <= 3; i++) {
                System.out.println("\t From child thread " + thread_name + " : i = " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception: Thread " + thread_name + " interrupted");
        }
        System.out.println("Terminating thread: " + thread_name);
    }
}

class JoinDemo {
    public static void main(String args[]) {
        ThreadJoin threadA = new ThreadJoin("A");
        ThreadJoin threadB = new ThreadJoin("B");
        ThreadJoin threadC = new ThreadJoin("C");
        ThreadJoin threadD = new ThreadJoin("D");
        m1(threadA, threadB, threadC, threadD);
        try {
            System.out.println("Threads Joining......");
            threadA.thread_object.join();
            threadB.thread_object.join();
            threadC.thread_object.join();
            threadD.thread_object.join();
        } catch (InterruptedException e) {
            System.out.println("Exception: Thread main interrupted.");
        }
        m1(threadA, threadB, threadC, threadD);
        System.out.println("Terminating thread: main thread.");
    }

    private static void m1(@NotNull ThreadJoin threadA, @NotNull ThreadJoin threadB, @NotNull ThreadJoin threadC, @NotNull ThreadJoin threadD) {
        System.out.println("Thread Status: Alive");
        System.out.println("Thread A: " + threadA.thread_object.isAlive());
        System.out.println("Thread B: " + threadB.thread_object.isAlive());
        System.out.println("Thread C: " + threadC.thread_object.isAlive());
        System.out.println("Thread D: " + threadD.thread_object.isAlive());
    }
}

