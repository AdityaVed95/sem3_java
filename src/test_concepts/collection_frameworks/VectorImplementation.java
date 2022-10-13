package test_concepts.collection_frameworks;

import java.util.*;


public class VectorImplementation
{
    public static void main(String[] args)
    {
        Vector <Integer> vector1 = new Vector<>(100);
        vector1.add(10);
        vector1.add(1,30);
        vector1.add(20);
        System.out.println(vector1);
        System.out.println(vector1.toString());

        // the below for loop throws array index out of bounds exception
        for (Integer integer : vector1) {
            System.out.println(integer);
        }

        for(Integer obj : vector1)
        {
            System.out.println(obj);
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
