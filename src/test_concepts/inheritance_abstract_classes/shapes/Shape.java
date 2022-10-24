package test_concepts.inheritance_abstract_classes.shapes;



public abstract class Shape
{
    int numberOfSides;
    String Name;

    public Shape(int numberOfSides, String name)
    {
        this.numberOfSides = numberOfSides;
        Name = name;
    }

    public abstract double Area();
    public abstract double Perimeter();



}
