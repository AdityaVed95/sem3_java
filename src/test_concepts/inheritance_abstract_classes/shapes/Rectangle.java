package test_concepts.inheritance_abstract_classes.shapes;

public class Rectangle extends Shape
{
    double length;
    double breadth;

    public Rectangle(int numberOfSides, String name, double length, double breadth)
    {
        super(numberOfSides,name);
        this.length = length;
        this.breadth = breadth;
    }


    @Override
    public double Area()
    {
        double a1 = (length*breadth);
        System.out.println("Area is : "+a1);
        return a1;
    }


    @Override
    public double Perimeter()
    {
        double p1 = (2*(length+breadth));
        System.out.println("Perimeter is : "+ p1);
        return p1;

    }


}
