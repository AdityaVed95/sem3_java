package test_concepts.super_keyword_constructor;

public class Student extends Person
{
    public Student()
    {
        // super(); // call to the constructor of super class should
        // be the 1st statement of the body of subclass constructor
        System.out.println("Student Class Constructor");
    }

    public void try_this()
    {
        // there is no way to explicitly call the constructor of the class
        // after the creation of the object.
        System.out.println("Try1");
        super.try_this();
    }

    // while doing function overloading : different overloaded functions
    // can have different return types
    // while doing function overriding : different over-ridden functions
    // cannot have different return types


//    public int try_this(int x)
//    {
//        System.out.println("Try2");
//        return x;
//    }
}
