package java_sem3_assignments_OOPM.lab8;

public class Carrier
{
    boolean busy;
    int communicatedValue;

    // if busy = true then get the value
    // if busy = false then set the value

    Carrier()
    {
        busy = false;
    }

    synchronized void setValue(int communicateValue)
    {
        try
        {
            if(busy == true)
            {
                wait();
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }


        this.communicatedValue = communicateValue;
        System.out.println("Generated number is : "+communicateValue);
        busy = true;
        notify();

    }

    synchronized int getValue()
    {
        try
        {
            if(!busy)
            {
                wait();
            }
        }

        catch (InterruptedException e)
        {
            System.out.println(e);
        }

        busy = true;
        notifyAll();
        return communicatedValue;
    }

    synchronized void setBusy() throws InterruptedException
    {
        if(busy == false)
        {
            wait();
        }

        busy = false;
        notify();
    }


}
