package ProgrammingInJavaOxford.Inheritance.constructor_behavoiur;

public class DerivedClass extends BaseClass
{
    DerivedClass()
    {
        System.out.println("Default constructor : Derived Class");
    }

    DerivedClass(int x)
    {
        System.out.println("Parameterised constructor : 1 parameter : Derived Class");
    }

    DerivedClass(int x, int y)
    {
        System.out.println("Parameterised constructor : 2 parameters : Derived Class");
    }
}
