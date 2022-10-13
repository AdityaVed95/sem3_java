package test_concepts.super_keyword_constructor;

public class Launcher
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Person);
        s1.try_this();
//        System.out.println(s1.try_this(10));
        int y = 95;
        double x = Double.valueOf(y);
    }
}


// https://www.geeksforgeeks.org/super-keyword/

//    Important Points to Remember while using Super Keyword
//
//        Call to super() must be the first statement in the
//        Derived(Student) Class constructor.
//        If a constructor does not explicitly invoke a superclass
//        constructor, the Java compiler automatically inserts a
//        call to the no-argument constructor of the superclass.
//        If the superclass does not have a no-argument constructor,
//        you will get a compile-time error. The object does have such
//        a constructor, so if the Object is the only superclass, there
//        is no problem.
