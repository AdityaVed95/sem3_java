package test_concepts.strings;

// this program compares the diff btw == and .equals

public class Test2
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = s1;
        String s3 = "Hello";
        String s4 = new String("Hello");
        String s5 = s4;
        String s6 = new String(s4);

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s4 == s5);
        System.out.println(s4 == s6);

//        true
//        true
//        false
//        true
//        false


//        The == operator compares reference or memory location or address
//        of objects in a heap, whether they point to the same location or not.
//
//        The main difference between the .equals() method and == operator
//        is that one is a method, and the other is the operator.
//
//        Use .equals() method for content comparison.

        // whenever we use the new keyword : memory is allocated for the
        // object
        // thus creating a string using the new keyword actually creates
        // another space in the memory
        // but when we just create new strings by using = operator then
        // new space is
        // not created in the memory, only the reference to that string
        // is assigned


    }
}
