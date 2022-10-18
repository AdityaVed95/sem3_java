package test_concepts.sorting_collection_framework_containing_objects_on_the_basis_of_properties_of_objects.test1;
import java.util.*;

public class Launcher
{
    // Method 1
    // To print sorted ArrayList objects
    // using enchanced for loop
    public static void print(ArrayList<CustomObject> list) {

        for (CustomObject obj : list) {
            System.out.println(obj.getCustomProperty());
        }
    }

    // Method 2
    // Comparing two list
    // using compareTo() method
    public static void sort(ArrayList<CustomObject> list) {

        list.sort(Comparator.comparing(CustomObject::getCustomProperty));
        // list.sort((o1, o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty()));

    }

    // Method 3
    // Adding custom objects
    public static void add(ArrayList<CustomObject> list) {

        // Adding elements to list
        // using add() method
        list.add(new CustomObject("Z"));
        list.add(new CustomObject("A"));
        list.add(new CustomObject("B"));
        list.add(new CustomObject("X"));
        list.add(new CustomObject("Aa"));
    }

    // Method 4
    // Main driver method
    public static void main(String[] args) {

        // Creating an empty ArrayList of custom class type
        ArrayList<CustomObject> list = new ArrayList<>();

        // Calling above methods defined inside class
        // in main() method
        add(list);
        sort(list);
        print(list);
    }
}


