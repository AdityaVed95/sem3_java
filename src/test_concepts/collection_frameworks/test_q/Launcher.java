package test_concepts.collection_frameworks.test_q;

import java.util.Collections;
import java.util.Vector;

public class Launcher
{
    public static void main(String[] args)
    {
        Vector <Employee> v1 = new Vector<>();
        Employee e1 = new Employee("Aditya",10,500);
        Employee e2 = new Employee("name2",20,200);
        Employee e3 = new Employee("name3",30,700);

        v1.add(e1);
        v1.add(e2);
        v1.add(e3);
//        Collections.sort();
//        v1.sort();
    }
}
