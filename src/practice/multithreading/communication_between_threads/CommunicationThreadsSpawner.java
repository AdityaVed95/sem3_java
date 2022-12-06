package practice.multithreading.communication_between_threads;

public class CommunicationThreadsSpawner
{
    // this is like the launcher class.
    public static void main(String[] args)
    {
        Carrier carrier = new Carrier();
        new Giver(carrier);
        new Taker(carrier);
    }
}
