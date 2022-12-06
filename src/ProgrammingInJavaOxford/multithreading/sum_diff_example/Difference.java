package ProgrammingInJavaOxford.multithreading.sum_diff_example;

public class Difference extends Thread
{
    int x,y;

    Difference(int a, int b)
    {
        x = a;
        y = b;
    }

    public void run()
    {
        System.out.println("Diff is : "+(x-y));
    }
}
