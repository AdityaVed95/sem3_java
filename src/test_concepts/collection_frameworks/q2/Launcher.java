package test_concepts.collection_frameworks.q2;

import java.lang.String;

public class Launcher
{
    public static void main(String[] args)
    {
        Student s1 = new Student(10,"Name1");
        System.out.println(s1);
        // test_concepts.collection_frameworks.q2.Student@36baf30c this is a hash index
        // System.out.println(s1);  is equivalent to : System.out.println(s1.toString());

        // the toString method inside the String class returns the
        // hash index of the object

        System.out.println(s1.toString());

    }
}
