package java_sem3_assignments_OOPM.lab5.postlab;
import java.util.*;

public class Demo
{
    public static void main(String[] args)
    {
        Vector v = new Vector(20);
        v.addElement("Geeksforgeeks");
        v.insertElementAt("Java", 1);
        System.out.println(v.firstElement());
    }

}
