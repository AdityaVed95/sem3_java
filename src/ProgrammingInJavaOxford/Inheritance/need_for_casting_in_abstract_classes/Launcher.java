package ProgrammingInJavaOxford.Inheritance.need_for_casting_in_abstract_classes;

public class Launcher
{
    public static void main(String[] args)
    {
        SuperClass s1 = new SubClass();
        // the below line generates error
        //s1.show();
        ((SubClass) s1).show();

        //  The s1 variable is casted into Subclass
        //  and then the show method is invoked.
        //  The cast is possible as the SubClass is
        // a subclass of the SuperClass class. The s1 refernce variable
        // will actually hold objects of SuperClass
    }
}
