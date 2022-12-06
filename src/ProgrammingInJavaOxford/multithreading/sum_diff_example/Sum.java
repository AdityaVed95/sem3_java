package ProgrammingInJavaOxford.multithreading.sum_diff_example;

public class Sum extends Thread
{
    int x,y;

    Sum(int a, int b)
    {
        x = a;
        y = b;
    }

    public void run()
    {
        System.out.println("Sum is : "+(x+y));
    }
}
