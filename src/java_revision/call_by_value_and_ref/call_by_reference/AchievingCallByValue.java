package java_revision.call_by_value_and_ref.call_by_reference;

public class AchievingCallByValue
{
    public static void main (String [] args)
    {
        int a[] = {10, 20, 30};
        int i;
        System.out.println("Before calling fxn : ");
        for (i = 0; i < 3; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }

        modify(a.clone());// not sending the actual array to
        // modify function , rather sending the clone
        // now this clone function is inbuilt for the arrays as arrays
        // are not user defined data types

        // but if we want to send the clone of an object to the function
        // then that clone method we will have to write it ourselves manually

        System.out.println("After fxn call");
        for(i=0;i<3;i++)
        {
            System.out.println("a[" + i + "]= "+a[i]);
        }

    }

    public static void modify (int[] x)
    {
        x[0]=100;
        x[1]=200;
        x[2]=300;

        int i;
        System.out.println("Inside the function : ");
        for(i=0;i<3;i++)
        {
            System.out.println("x[" + i + "]= "+x[i]);
        }
    }
}
