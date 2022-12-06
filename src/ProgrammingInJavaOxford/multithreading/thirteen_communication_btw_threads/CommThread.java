package ProgrammingInJavaOxford.multithreading.thirteen_communication_btw_threads;


class CommThread
{
    public static void main(String args[])
    {
        Carrier c = new Carrier();
        new Giver(c);
        new Taker(c);

        // now if the situation demands that we want to put and get data for multiple such pipes simultaneously
        // for this we will have to create more and more instances of the Carrier class.
    }
}
