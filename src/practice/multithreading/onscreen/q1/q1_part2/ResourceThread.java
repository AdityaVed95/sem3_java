package practice.multithreading.onscreen.q1.q1_part2;

class ResourceThread implements Runnable
{
    String name ;

    ResourceThread(String name)
    {
        this.name = name;
        new Thread(this,"new").start();
    }

    public void run()
    {
        Resource.Display(name);
    }
}