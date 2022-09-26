package test_concepts.array_of_objects;
import java.util.*;
public class Launcher
{
    public static void main(String[] args)
    {
        Complex[] array1 = new Complex[3];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<2;i++)
        {
            double r1,i1;

            System.out.println("Enter real part of "+(i+1)+"th number");
            r1= sc.nextDouble();

            System.out.println("Enter imaginary part of "+(i+1)+"th number");
            i1= sc.nextDouble();


//            array1[i].setValue(r1,i1);
//            the above line is incorrect because array1[i] is still null, so you have to instantiate that object 1st and then call its methods and variables

           // the below step is the crucial step
            // instantiating the object and then calling the parameterised constructor of that object
           array1[i] = new Complex(r1,i1);

        }

        array1[2] = new Complex();
        // the above line is necessary
        array1[2].sum(array1[0],array1[1]);
        Complex.display_array(array1);

    }
}
