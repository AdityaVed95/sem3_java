package ProgrammingInJavaOxford.Inheritance.abstract_classes;

public class Lion extends Animal
{
    Lion()
    {
        this.name = "Lion";
        this.species = "Asiatic";
    }

    public void sound()
    {
        System.out.println("Lion Roars !!!");
    }

}
