package practice.q1;

import java.util.Scanner;

public class Launcher
{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // input data
        System.out.println("Enter length");
        double length = sc.nextDouble();
        System.out.println("Enter breadth");
        double breadth  = sc.nextDouble();

        // create object
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setData(length,breadth);
        double area1 = rectangle1.calculateAndReturnArea();
        System.out.println("The area is : "+area1);

        double perimeter1 = rectangle1.calculateAndReturnPerimeter();
        System.out.println("The perimeter is : "+perimeter1);

    }
}
