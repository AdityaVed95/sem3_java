package java_sem3_assignments_OOPM.lab5.postlab;
import java.util.*;

public class AddAllCollecitons
{
    public static void main(String[] args)
    {
        // Creating an empty Vector
        Vector<String> vt = new Vector<String>();

        // Use add() method to add elements in the Vector

        vt.add("10");
        vt.add("50");

        // A collection is created
        Collection<String> c = new LinkedList<>();

        c.add("Computer");
        c.add("Engineering");

        // Displaying the Vector
        System.out.println("The Vector is: " + vt);

        // Appending the collection to the vector
        vt.addAll(1,c);

        // Clearing the vector using clear() and displaying
        System.out.println("The new vector is: " + vt);

    }

}
