package test_concepts.context_of_access;

public class Launcher
{
    int age;
    static String gender;

    public void display()
    {
        System.out.println(age);
        System.out.println(gender);
        // accessing a static member from non static context is allowed
    }

    public static void tryToDisplay()
    {
        // System.out.println(age);
        // the above line gives error
        System.out.println(gender);
        // accessing a non static member from static context is not allowed
    }
}
