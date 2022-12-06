package ProgrammingInJavaOxford.multithreading.sum_diff_example;

public class Launcher
{
    public static void main(String[] args)
    {
        Sum s1 = new Sum(10,5);
        s1.start();

        Difference d1 = new Difference(50,20);
        d1.start();

        for(int i =0 ;i<10;i++)
        {
            System.out.println("in main thread : "+i);
        }

        // Thread.State
    }
}
