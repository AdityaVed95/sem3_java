package test_concepts.sorting_collection_framework_containing_objects_on_the_basis_of_properties_of_objects.test2;
import test_concepts.sorting_collection_framework_containing_objects_on_the_basis_of_properties_of_objects.test1.CustomObject;

import java.util.*;

public class Launcher
{
    public static void add(ArrayList<Emp1> list)
    {
        list.add(new Emp1(100));
        list.add(new Emp1(900));
        list.add(new Emp1(400));
        list.add(new Emp1(300));
        list.add(new Emp1(700));

    }

    public static void sort(ArrayList<Emp1> list)
    {
        list.sort(Comparator.comparing(Emp1::getSalary));
    }

    public static void print(ArrayList<Emp1> list)
    {
        for(Emp1 obj1 : list)
        {
            System.out.println(obj1.getSalary());
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Emp1> list1 = new ArrayList<>();
        add(list1);
        sort(list1);
        print(list1);

    }
}
