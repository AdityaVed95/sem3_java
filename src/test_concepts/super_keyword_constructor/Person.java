package test_concepts.super_keyword_constructor;

public class Person
{

    Person() // try passing int p_age as parameters to this constructor
    {
        System.out.println("Person Class Constructor");
    }

    public void try_this()
    {
        System.out.println("Try in Person");
        // now if this method returns int then an error will be generated
    }
}
