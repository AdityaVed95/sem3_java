package ProgrammingInJavaOxford.multithreading.thirteen_communication_btw_threads;

class Carrier {
    int CommunicatedValue;
    boolean busy = false;

    // when busy = false : the value is put
    // when busy = true : the value is get(or taken)
    synchronized void putValue(int CommunicatedValue)
    {
        if (busy)
        {

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Put Value: InterruptedException");
            }
        }
        this.CommunicatedValue = CommunicatedValue;
        busy = true;
        System.out.println("Put: " + CommunicatedValue);
        notify();
    }

    synchronized int getValue()
    {
        if (!busy)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Get Value: InterruptedException");
            }
        }
        busy = false;
        System.out.println("Get: " + CommunicatedValue);
        notify();
        return CommunicatedValue;
    }
}