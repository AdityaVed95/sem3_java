package java_sem3_assignments_OOPM.lab1.postlab;

public class Polygon
{
    String polygonType;
    double radius;
    double length;
    double width;
    double area;

    Polygon(String polygonType, double radius)
    {
        this.polygonType = polygonType;
        this.radius = radius;
    }

    Polygon(String polygonType, double length,double width)
    {
        this.polygonType= polygonType;
        this.length = length;
        this.width = width;
    }
    public void calculateArea()
    {
        if(polygonType == "circle")
        {
            area = 3.14*radius*radius;
        }
        if (polygonType == "rectangle")
        {
            area = length*width;
        }
    }

    public void display_cui()
    {
        System.out.println("Area : "+area);
    }


}
