package practice.q1;

// constructors have no return type

public class Rectangle
{
    private double length;
    private double breadth;
    private double area;
    private double perimeter;

    public void setData(double length, double breadth)
    {
        this.length = length; // this keyword is used for referring to the object that has invoked that method
        this.breadth = breadth;
    }

    public double calculateAndReturnArea()
    {
        area = length*breadth;
        return area;
    }
    public double calculateAndReturnPerimeter()
    {
        perimeter = 2*(length+breadth);
        return perimeter;
    }


}
