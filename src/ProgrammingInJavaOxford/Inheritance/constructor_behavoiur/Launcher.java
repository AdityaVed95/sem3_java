package ProgrammingInJavaOxford.Inheritance.constructor_behavoiur;

public class Launcher
{
    public static void main(String[] args)
    {
        DerivedClass dc1 = new DerivedClass();
        DerivedClass dc2 = new DerivedClass(10);
        DerivedClass dc3 = new DerivedClass(10,20);

        // even if we mention or not : the default constructor of the base class is always executed.
    }
}
