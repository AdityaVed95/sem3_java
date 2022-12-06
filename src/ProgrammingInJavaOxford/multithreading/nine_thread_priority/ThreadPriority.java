package ProgrammingInJavaOxford.multithreading.nine_thread_priority;

class ThreadOne extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("\tFrom child thread 1 : i =" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("child Thraed 1 interrupted");
        }
        System.out.println("Exit from child Thread 1");
    }
}

class ThreadTwo extends Thread {
    public void run() {
        try {
            for (int j = 1; j <= 5; j++) {
                System.out.println("\tFrom child thread 2 : j =" + j);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("child thread 2 interrupted");
        }
        System.out.println("Exit from child thraed 2");
    }
}

class ThreadThree extends Thread {
    public void run() {
        try {
            for (int k = 1; k <= 5; k++) {
                System.out.println("\tFrom child thread 3 : k =" + k);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("child thread 3 interrupted");
        }
        System.out.println("Exit from child thread 3");
    }
}

class ThreadPriority {
    public static void main(String args[]) {
        ThreadOne a = new ThreadOne();
        ThreadTwo b = new ThreadTwo();
        ThreadThree c = new ThreadThree();
        System.out.println("Default Priority for thread 1:" + a.getPriority());
        System.out.println("Default Priority for thread 2:" + b.getPriority());
        System.out.println("Default Priority for thread 3:" + c.getPriority());
        System.out.println(" ");
        a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(Thread.NORM_PRIORITY);
        c.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority set for thread 1: " + a.getPriority());
        System.out.println("Priority set for thread 2: " + b.getPriority());
        System.out.println("Priority set for thread 3: " + c.getPriority());

        System.out.println(" ");
        System.out.println("All the Three threads start from here");
        a.start();
        b.start();
        c.start();
    }
}