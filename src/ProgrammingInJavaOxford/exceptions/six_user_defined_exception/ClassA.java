package ProgrammingInJavaOxford.exceptions.six_user_defined_exception;

public class ClassA implements AutoCloseable
{
    public void close()
    {
        System.out.println("In close method of ClassA");
    }

    public void display()
    {
        System.out.println("in display method of ClassA");
    }

}
