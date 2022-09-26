package java_revision.call_by_value_and_ref.call_by_reference.second_call_by_ref_using_object;

// this class is not meant t

public class MyClass
{
    int a;
    MyClass()
    {
        a=10;
        System.out.println("Hello you are in the constructor of MyClass");
    }


    public String MyClass()
    {
        return "Hello Aditya";
    }

    public void greet1()
    {
        System.out.println("Greetings inside greet1 fxn");
    }

    public static void greet2() // this not kept static so that it can be called using <object_name>.<method_name>
    {
        System.out.println("Hello you are in the greet2 fxn of MyClass");
    }


}
