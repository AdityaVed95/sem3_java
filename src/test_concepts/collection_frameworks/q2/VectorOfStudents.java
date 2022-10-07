package test_concepts.collection_frameworks.q2;

import java.util.*;

public class VectorOfStudents
{
    public static void main(String[] args)
    {
        int n = 10000;
        Vector <Student> vector1 = new Vector <Student> (n);
        vector1.add(new Student(10,"hello"));
        vector1.add(new Student(20,"Bye"));

        System.out.println(vector1);

        for(int i=0;i<vector1.size();i++)
        {
            System.out.println(vector1.get(i));
        }

        int size = vector1.size(); // returns the number of elements actually
        // present in the vector , irrespective of the actual size of the
        // vector (actual amount of memory allocated)
        System.out.println(size);


    }

}

