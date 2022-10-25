package ProgrammingInJavaOxford.Inheritance.circle_and_cylinder_example;

public class Circle
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return (Math.PI*Math.pow(radius,2));
    }

}
