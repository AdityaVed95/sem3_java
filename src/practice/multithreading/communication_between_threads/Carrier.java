package practice.multithreading.communication_between_threads;

public class Carrier
{
    boolean busy;
    int communicatedValue;

    // if busy = true : the getValue function is getting the value
    // if busy = false : the putValue function is putting the value

    Carrier()
    {
        busy = false;

    }

    synchronized void putValue(int communicatedVal) throws InterruptedException
    {
        if(busy)
        {
            wait();
        }

        busy = true;
        communicatedValue = communicatedVal;
        System.out.println("Put : "+communicatedValue);
        notifyAll();
    }

    synchronized void getValue() throws InterruptedException
    {
        if(!busy)
        {
            wait();
        }

        busy = false;
        System.out.println("Get : "+communicatedValue);
        notifyAll();

    }

}
