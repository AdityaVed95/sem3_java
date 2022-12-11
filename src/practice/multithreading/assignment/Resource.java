package practice.multithreading.assignment;

import java.util.Vector;

public class Resource
{
    static Vector<Integer> vector1 = new Vector();

    // instead of a single thread getting access to the vector, I created a method that modifies the vector and i ensure that this method is accessed only by one thread at a time

    synchronized public static void addAndRemove(int num,String name)
    {
        if(name.equals("random"))
        {
            //add value

            vector1.add(num);
            System.out.println("Added : "+num);

        }

        else if (name.equals("sq"))
        {
            if(vector1.get(0) % 2 == 0)
            {
                System.out.println("Even number added : "+num);
                System.out.println("Square is : "+num*num);
                vector1.remove(0);
            }

        }

        else if(name.equals("cu"))
        {
            if(vector1.get(0) % 2 != 0)
            {
                System.out.println("Odd number added : "+num);
                System.out.println("Cube is : "+num*num*num);
                vector1.remove(0);
            }
        }

    }
}
