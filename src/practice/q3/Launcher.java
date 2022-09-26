package practice.q3;

public class Launcher
{
    public static void main(String[] args)
    {
        TestStaticNonStatic object1 = new TestStaticNonStatic(10,20);
        object1.display();

        TestStaticNonStatic object2 = new TestStaticNonStatic(30,40);

        object1.display();
        object2.display();

    }
}
