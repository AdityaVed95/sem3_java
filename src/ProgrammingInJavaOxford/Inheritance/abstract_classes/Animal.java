package ProgrammingInJavaOxford.Inheritance.abstract_classes;

public abstract class Animal
{
    // can contain instance variables
    String name;
    String species;

    // contains partial implementation
    public void eat(String foodItems)
    {
        System.out.println(name+" of "+species+" kind eats "+foodItems);
    }

    public abstract void sound();

    // the below lines is not allowed
    // abstract methods must be non static
    // abstract methods can never be final
    // public static abstract cry();
    // public final abstract cry();

}


