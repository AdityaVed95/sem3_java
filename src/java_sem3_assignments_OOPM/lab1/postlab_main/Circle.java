package java_sem3_assignments_OOPM.lab1.postlab_main;

public class Circle
{
    double radius;


    Circle(double radius)
    {
        this.radius = radius;
    }

    public void calculateAreaAndPrintCui()
    {
        double area = (Math.PI)*radius*radius;
        System.out.println("Area : "+area);
    }

    public void calculateCircumferenceAndPrintCui()
    {
        double circumference = 2*(Math.PI)*radius;
        System.out.println("Circumference : "+circumference);
    }

}
