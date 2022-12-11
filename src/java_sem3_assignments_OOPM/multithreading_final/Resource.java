package java_sem3_assignments_OOPM.multithreading_final;

import java.util.Vector;

public class Resource
{
    static Vector<Integer> vector1 = new Vector();
    static int is_full=0;

    // instead of a single thread getting access to the vector, I created a method that modifies the vector and i ensure that this method is accessed only by one thread at a time


}
