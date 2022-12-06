package java_sem3_assignments_OOPM.lab5.test1;

public class Derived extends Base
{
    public static void display()
    {
        System.out.println("hi in sub");
        Base.display();
        // the below line is invalid
        // super.display();

    }

}
