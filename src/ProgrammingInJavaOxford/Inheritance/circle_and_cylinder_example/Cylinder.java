package ProgrammingInJavaOxford.Inheritance.circle_and_cylinder_example;

public class Cylinder extends Circle
{
    double height;

    Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;

    }

    public double getHeight()
    {
        return height;
    }

    public double getArea()
    {
        return 2*super.getArea() + 2*radius*height*Math.PI ;
    }

}
