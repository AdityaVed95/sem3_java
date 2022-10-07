package test_concepts.strings.string_manipulation;

public class Concatenate
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1+s2);
        int x= 10;
        System.out.println(s1+x+s2);

        String s3 = s1+s2;
        System.out.println(s3);


        String s5 = s1.concat(s2);
        System.out.println(s5);

        System.out.println(s3 == s5);
        // concatenation of strings doesnt change the value of original strings
    }
}
