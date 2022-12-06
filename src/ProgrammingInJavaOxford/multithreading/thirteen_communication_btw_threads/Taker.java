package ProgrammingInJavaOxford.multithreading.thirteen_communication_btw_threads;


class Taker implements Runnable {
    Carrier c;

    Taker(Carrier c) {
        this.c = c;
        new Thread(this, "Taker thread").start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            c.getValue();
        }
    }
}
