package test_concepts.inheritance_abstract_classes.shapes;

public class Circle extends Shape
{

    double radius;

    public Circle(int numberOfSides, String name, double radius)
    {
        super(numberOfSides, name);
        this.radius = radius;

    }

    @Override
    public double Area()
    {
        double a1 = (Math.PI)*( Math.pow(radius,2) ) ;
        System.out.println("Area is : "+ a1);
        return a1;
    }

    @Override
    public double Perimeter()
    {
        double a1 = (2*Math.PI*radius);
        System.out.println("Perimeter is : "+a1);
        return a1;

    }
}
