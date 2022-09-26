package java_revision.call_by_value_and_ref.call_by_reference;
// running this file from the terminal :
//  java java_revision.call_by_val_and_ref.call_by_reference.CallByReference
public class CallByReference
{
    //CallByReference happens when we pass an object or an array
    // as a parameter to other function

    public static void main (String [] args)
    {
        int a[] = {10,20,30};
        int i;
        System.out.println("Before calling fxn : ");
        for(i=0;i<3;i++)
        {
            System.out.println("a[" + i + "]= "+a[i]);
        }

        modify(a);

        System.out.println("After fxn call");
        for(i=0;i<3;i++)
        {
            System.out.println("a[" + i + "]= "+a[i]);
        }

        System.out.println("Hence the value of the array has been" +
                " updated using call by reference");
    }

    public static void modify(int x[])
    {
        x[0] = 100;
        x[1] = 200;
        x[2] = 300;

        int i;
        System.out.println("Inside the function : ");
        for(i=0;i<3;i++)
        {
            System.out.println("x[" + i + "]= "+x[i]);
        }

    }
}

