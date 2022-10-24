package test_concepts.inheritance_abstract_classes.Students_test;

import java.util.*;

public class Student
{
    ArrayList <Integer> arrayList;

    Student()
    {
        arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(40);
        arrayList.add(15);
        arrayList.add(90);
        arrayList.add(80);
        arrayList.add(100);
        arrayList.add(5);

    }

    public void sort()
    {
        Collections.sort(arrayList);
    }

    public ArrayList<Integer> getArrayListObject()
    {
        return arrayList;
    }
}
