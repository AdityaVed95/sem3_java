package test_concepts.collection_frameworks;

import java.util.*;


public class VectorImplementation
{
    public static void main(String[] args)
    {
        Vector <Integer> vector1 = new Vector<>();
        vector1.add(10);
        vector1.add(30);
        vector1.add(20);
        System.out.println(vector1);
        System.out.println(vector1.toString());

        // the below for loop throws array index out of bounds exception
        for(int i =0;i<vector1.capacity();i++)
        {
            System.out.println(vector1.get(i));
        }

        Vector <String> vector2 = new Vector<String>();
        vector2.add("Hello world !");
        vector2.add("Bye World ! ");
        System.out.println(vector2);
        System.out.println(vector2.toString());

        Collections.sort(vector1);
        System.out.println(vector1);



    }


    // vectors are used for heterogeneous data type

}
