package java_sem3_assignments_OOPM.lab1.postlab;

import java.util.Scanner;

public class Launcher
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();
        Polygon Circle = new Polygon("circle",radius);

        System.out.println("Enter length of rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter width of rectangle");
        double width = sc.nextDouble();
        Polygon Rectangle = new Polygon("rectangle",length,width);

        Circle.calculateArea();
        Rectangle.calculateArea();
        Circle.display_cui();
        Rectangle.display_cui();

    }
}
