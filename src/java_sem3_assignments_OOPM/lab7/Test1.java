package java_sem3_assignments_OOPM.lab7;

public class Test1
{
    public static void main(String[] args)
    {
        String s1 = "hello";
        s1 = method1(s1);
        System.out.println(s1);


    }

    public static String method1(String s)
    {
        s = "bye";
        return s;
    }

}
