package test_concepts.strings;

public class ToStringTest
{
    public String toString()
    {
        return "This is an object of ToStringTest";
    }
    public static void main(String[] args)
    {
        ToStringTest obj1 = new ToStringTest();
        System.out.println(obj1);
        System.out.println(obj1.toString());
    }
}
