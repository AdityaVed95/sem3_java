package ProgrammingInJavaOxford.Inheritance.constructor_behavoiur;

public class BaseClass
{

    // the base class should always have a default constructor.
    // if not present then we will get compiled time error

    BaseClass()
    {
        System.out.println("Default constructor : Base Class");
    }

    BaseClass(int x)
    {
        System.out.println("Parameterised constructor : Base Class");
    }
}
