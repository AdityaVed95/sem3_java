package test_concepts.collection_frameworks;


import java.util.Vector;

public class VectorSetSize
{
    public static void main(String[] args)
    {
        Vector<String> v1 = new Vector<>();
        v1.add("name1");
        v1.add("name2");
        v1.add(1,"name_middle");

        v1.setSize(15);

        for(int i = 0; i< v1.size();i++)
        {
            System.out.println(v1.get(i));
        }

        v1.insertElementAt("hello",5);
        System.out.println(v1);

    }
}
