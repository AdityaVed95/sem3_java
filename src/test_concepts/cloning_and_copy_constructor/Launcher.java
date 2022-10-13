package test_concepts.cloning_and_copy_constructor;

public class Launcher
{
    public static void main(String[] args)
    {
        Customer obj1 = new Customer("Aditya",10);
        Customer obj2 = new Customer(obj1);
        Customer obj3 = obj1.clone();
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());

        // clone method creates a deep copy of the object :
        // check one thing :
        // if the customer class has a user defined object as one of
        // its instance variables then does the clone method create
        // a new user defined object or does clone method make it refer
        // to the same object
    }
}
