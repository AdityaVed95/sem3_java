package java_sem3_assignments_OOPM.lab8.refact4_not_working;

import java.util.*;

public class Launcher
{
    public static void main(String[] args)
    {
//        PriorityQueue<String> pq =new PriorityQueue<String>();
        List list = Collections.synchronizedList(new Vector<Integer>());

//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);
//        int x = (int) list.get(0);
//        System.out.println(x);
//        list.remove(0);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);


        new RandomGenerate(list);
        new Square(list);
        new Cube(list);

    }
}
