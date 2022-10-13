package test_concepts.cloning_and_copy_constructor;

public class Customer implements Cloneable
{
    String name;
    int age;


    Customer(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    Customer(Customer customerObject1)
    {
        this.age = customerObject1.age;;
        this.name = customerObject1.name;
    }


    @Override
    public Customer clone() {
        try {
            Customer clone = (Customer) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
