package test_concepts.static_variable_test;

public class Launcher3
{
    public static void main(String[] args)
    {
        // x = 100
        Temp3 obj1 = new Temp3();
        // x = 101
        Temp3 obj2 = new Temp3();
        // x = 102
        System.out.println(Temp3.x);

        obj2.x = 500;

        // x = 500

        Temp3 obj3 = new Temp3();
        // x = 501

        System.out.println(Temp3.x);

    }
}
