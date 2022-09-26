package test_concepts.call_by_ref;

public class Launcher1
{
    public static void main(String[] args)
    {
        Modify obj1 = new Modify(45,30);
        System.out.println("Before swapping :");
        obj1.display();
        obj1.swap();
        System.out.println("After swapping :");
        obj1.display();
    }
}
