package test_concepts.static_variable_test;

public class Launcher
{
    public static void main(String[] args)
    {
        Temp t1 = new Temp();
        t1.x = 101;
        System.out.println(t1.x);

        Temp.x = 500;
        System.out.println(t1.x);
    }
}
