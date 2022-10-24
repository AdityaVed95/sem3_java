package test_concepts.inheritance_abstract_classes.shapes;

public class Triangle extends Shape
{
    double base;
    double height;

    public Triangle(int numberOfSides, String name, double base, double height)
    {
        super(numberOfSides, name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double Area()
    {
        double a1 = (base*height/2);
        System.out.println("Area is  : "+a1);
        return a1;
    }

    @Override
    public double Perimeter()
    {
        System.out.println("No easy formula for perimeter !!!");
        return 0;
    }
}
