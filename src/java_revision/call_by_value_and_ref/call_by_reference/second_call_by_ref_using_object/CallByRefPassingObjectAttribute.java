package java_revision.call_by_value_and_ref.call_by_reference.second_call_by_ref_using_object;

public class CallByRefPassingObjectAttribute
{
    public static void main(String [] args)
    {
        MyClass object1 = new MyClass();
        System.out.println("before fxn call value of object1.a is  : "+object1.a);
        modify(object1.a);
        System.out.println("after fxn call value of object1.a is : "+object1.a);
    }

    public static void modify(int x)
    {
        x = 100;
        System.out.println("Value of x is : "+x);
    }

}
