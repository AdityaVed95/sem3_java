package test_concepts.collection_frameworks;

import java.util.Vector;

public class HetrogenousVector
{
    public static void main(String[] args)
    {
        Vector v1 = new Vector(3,2);
        Vector <Integer> v2 = new Vector<>();
        Vector <String> v3 = new Vector<>(10);
        v1.add(new String("Aditya"));
        v1.add(Integer.valueOf("100"));
        v1.add(Float.valueOf("-432.5425"));


    }
}
