package test_concepts.inheritance_abstract_classes.Students_test;

import java.util.ArrayList;

public class Toppers extends Student
{
    ArrayList <Integer> arrayList2;

    public Toppers()
    {
        arrayList2 = new ArrayList<>(3);
    }

    public void toppers()
    {
        ArrayList <Integer> arrayList1 = getArrayListObject();

        for(int i=0; i<3;i++)
        {
            arrayList2.set(i,arrayList1.get(i));
        }
    }

    public void showToppers()
    {
        System.out.println(arrayList2);
    }

}
