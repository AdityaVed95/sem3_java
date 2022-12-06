package ProgrammingInJavaOxford.exceptions.four_try_with_resources;

public class Launcher
{
    public static void main(String[] args)
    {
        System.out.println("Program to understand the flow of execution when we have try-with-resources , catch and finally block");

        try(ClassA a1 = new ClassA(); ClassB b1 = new ClassB())
        {

            System.out.println("within try with sources block");
            // the below line is not possible since a1 and b1 are final variables
//            a1 = null;

            // try commenting below line
            throw new Exception();


            // the close method of object a1 and b1 are called irrespective
            // of the occurrence of an exception


        }
        catch (Exception e)
        {
            System.out.println("within catch block");
            e = null; // e is not final
        }

        finally
        {
            System.out.println("In finally block");
        }
    }
}
