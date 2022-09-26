package java_revision.call_by_value_and_ref.call_by_reference;

public class TryingCallByValue
{
    public static void main (String [] args)
    {
        int a[] = {10, 20, 30};
        int i;
        System.out.println("Before calling fxn : ");
        for (i = 0; i < 3; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }

        modify(a);

        System.out.println("After fxn call");
        for(i=0;i<3;i++)
        {
            System.out.println("a[" + i + "]= "+a[i]);
        }

    }

    public static void modify ( int x[])
    {
        int y[] = x;

        y[0]=100;
        y[1]=200;
        y[2]=300;

        int i;
        System.out.println("Inside the function : ");
        for(i=0;i<3;i++)
        {
            System.out.println("y[" + i + "]= "+y[i]);
        }
    }

}
