package test_concepts.strings.string_manipulation;

public class InternTest
{
    public static void main(String[] args)
    {
//        String Object in Heap memory
//        String Object in String Constant Memory Pool


        String s1 = "Hello"; // made in memory pool
        String s2 = new String("Hello"); // made outside memory pool in heap memory
        s2.intern(); // has no effect , the result is not stored in any object/reference
        System.out.println(s1 == s2);
        String s3 = s2.intern(); // s3 is created in the memory pool
        System.out.println(s3 == s1);
        System.out.println(s2 == s1);

    }
}
