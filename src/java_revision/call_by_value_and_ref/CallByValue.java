package java_revision.call_by_value_and_ref;

public class CallByValue
{
    //CallByValue is used when primitive data types are passed
    // as parameters to the function

    public static void main(String [] args)
    {
        int a=10;
        System.out.println("The value of a is : "+a);
        modify(a);
        System.out.println("The value of a is : "+a);
    }

    public static void modify(int x)
    {
        x = 100;
        System.out.println("The value of x is : "+x);

    }

    // modify function has to be a static function because non-static
    // method cannot
    // be referenced from a static context

}