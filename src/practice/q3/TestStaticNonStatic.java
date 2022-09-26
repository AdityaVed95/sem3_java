package practice.q3;

public class TestStaticNonStatic
{
    public int x;
    public static int no_of_objects_instantiated = 0;
    public static int z;

    TestStaticNonStatic(int x, int z_passed)
    {
        this.x = x;
        z = z_passed;
        no_of_objects_instantiated++;
    }

    public void display()
    {
        System.out.println("x is "+x);
        System.out.println("no_of_objects_instantiated is "+ no_of_objects_instantiated);
        System.out.println("z is "+z);
    }
}
