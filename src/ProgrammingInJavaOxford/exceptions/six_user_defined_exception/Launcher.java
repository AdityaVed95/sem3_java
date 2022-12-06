package ProgrammingInJavaOxford.exceptions.six_user_defined_exception;

public class Launcher
{
    public static void main(String[] args)
    {
        try(ClassA object1 = new ClassA())
        {
            object1.display();
            method1();
        }

        catch (MyNewException e)
        {
            System.out.println("inside catch : ");
            System.out.println("The exception is : "+e);
            return;
            // even though there is a return statement in
            // catch block , the finally block gets executed.
        }

        finally
        {
            System.out.println("in finally block");
        }

    }

    public static void method1() throws MyNewException
    {
        throw new MyNewException("Testing throw");
    }
}
