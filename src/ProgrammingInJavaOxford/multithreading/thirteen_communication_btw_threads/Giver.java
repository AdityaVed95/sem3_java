package ProgrammingInJavaOxford.multithreading.thirteen_communication_btw_threads;

class Giver implements Runnable {
    Carrier c;

    Giver(Carrier c) {
        this.c = c;
        new Thread(this, "Value Giver").start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            c.putValue(i);

        }
    }
}