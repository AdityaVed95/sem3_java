package test_concepts.sorting_collection_framework_containing_objects_on_the_basis_of_properties_of_objects.test3;

import java.util.*;

public class Launcher
{
    public static void add(Vector<Emp3> list)
    {
        list.add(new Emp3(100,"name1"));
        list.add(new Emp3(900,"name2"));
        list.add(new Emp3(400,"name3"));
        list.add(new Emp3(300,"name4"));
        list.add(new Emp3(700,"name5"));

    }

    public static void sort(Vector<Emp3> list)
    {
        list.sort(Comparator.comparing(Emp3::getSalary));
    }

    public static void print(Vector<Emp3> list)
    {
        for(Emp3 obj1 : list)
        {
            System.out.print(obj1.getName()+" -----> ");
            System.out.println(obj1.getSalary());
        }
    }

    public static void main(String[] args)
    {
        Vector<Emp3> list1 = new Vector<>();
        add(list1);
        sort(list1);
        print(list1);

    }
}