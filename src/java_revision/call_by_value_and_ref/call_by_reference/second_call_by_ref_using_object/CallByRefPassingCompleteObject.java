package java_revision.call_by_value_and_ref.call_by_reference.second_call_by_ref_using_object;

// here we learn that even if we pass the attribute of an object,
// then that attribute is passed by reference and not passed by value

public class CallByRefPassingCompleteObject
{
    public static void main(String [] args)
    {
        MyClass object1 = new MyClass();

        object1.greet1(); // this is how we can access a non-static method of a class
        MyClass.greet2(); // this is how we can access a static method of a class
        String print_me = object1.MyClass(); // calling the function and not the constructor
        // constructor never has a return type because it never returns anything

        System.out.println(print_me);

        System.out.println("Value of a in main function before" +
                " calling increase function : "+object1.a);
        increase(object1);
        System.out.println("Value of a in main function after" +
                " calling increase function : "+object1.a);

    }
    public static void increase(MyClass objectPassed)
    {
        objectPassed.a = 100;
        System.out.println("Value of x in increase function : "+objectPassed.a);
    }
}


