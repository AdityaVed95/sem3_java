package test_concepts.inheritance_abstract_classes.shapes;

public class Cuboid extends Rectangle
{
    double height;

    Cuboid(int numberOfSides,String name,double length, double breadth,double height)
    {
        super(numberOfSides,name,length,breadth);
        this.height = height;
    }

    public double volume()
    {
        double vol = height*this.Area();
        System.out.println("The volume is : "+vol);
        return vol;
    }

}
