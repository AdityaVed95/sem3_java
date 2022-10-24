package ProgrammingInJavaOxford.Inheritance.method_overriding;

public class SubClass extends SuperClass
{

    // method in sub class and method in super class with the same name , return type and
    // method signature
    public int display1(int x)
    {
        System.out.println("Sub class display 1");
        // below line is used to call the overriden method of the superclass.
//        super.display1(x);
        return x;
    }

    // method in sub class and method in super class with the same name , return type but different
    // signature ===> this is not an example of function overriding.
    // doesnt even show the symbol of overriding besides the name of the method in the line below.
    public int display2(int x)
    {
        System.out.println("Sub class display 2");
//        super.display2(x,20);
        return x;
    }


    // if the name of the method in the sub class and the super class is the same
    // and their signature is the same then they must
    // have the same return type

    // the below lines of code will generate a compiled time error.

//    public void display3(int x )
//    {
//        System.out.println("Sub class display 3");
//    }


    public void display4()
    {
        System.out.println("Sub class display 4");
    }



}
