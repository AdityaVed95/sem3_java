package java_sem3_assignments_OOPM.lab1.postlab_main;

import java.util.Scanner;

public class Launcher
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle ");
        double radius = sc.nextDouble();;

        Circle C1 = new Circle(radius);
        C1.calculateAreaAndPrintCui();
        C1.calculateCircumferenceAndPrintCui();


    }
}
