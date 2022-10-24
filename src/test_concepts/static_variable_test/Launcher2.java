package test_concepts.static_variable_test;

public class Launcher2
{
    public static void main(String[] args)
    {
        Temp2 obj1 = new Temp2();
        Temp2 obj2 = new Temp2();

        obj1.x = 500;
        obj2.x ++;

        Temp2 obj3 = new Temp2();

        System.out.println(Temp2.x);

    }
}
