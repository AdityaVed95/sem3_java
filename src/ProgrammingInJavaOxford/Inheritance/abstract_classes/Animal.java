package ProgrammingInJavaOxford.Inheritance.abstract_classes;

public abstract class Animal
{
    String name;
    String species;

    public void eat(String foodItems)
    {
        System.out.println(name+" of "+species+" kind eats "+foodItems);
    }

    public abstract void sound();

}


