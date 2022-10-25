package ProgrammingInJavaOxford.Inheritance.circle_and_cylinder_example;

public class Launcher
{
    public static void main(String[] args)
    {
        Cylinder cylinder1 = new Cylinder(7,10);
        System.out.println("The surface area of the cylinder is : "+cylinder1.getArea());

        Circle c1 = new Circle(7);
        System.out.printf("The area of the circle is : "+c1.getArea());
    }
}
