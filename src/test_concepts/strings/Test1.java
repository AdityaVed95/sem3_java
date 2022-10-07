package test_concepts.strings;

public class Test1
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "World";

        String s3 = new String("Hello");
        String s4 = new String("World");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);


    }
}
