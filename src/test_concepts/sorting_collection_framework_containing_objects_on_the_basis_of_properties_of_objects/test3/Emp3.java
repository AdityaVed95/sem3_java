package test_concepts.sorting_collection_framework_containing_objects_on_the_basis_of_properties_of_objects.test3;

public class Emp3
{
    double salary;
    String name;

    Emp3(double salary, String name)
    {
        this.name = name;
        this.salary = salary;
    }


    public double getSalary()
    {
        return this.salary;
    }

    public String getName()
    {
        return this.name;
    }
}
